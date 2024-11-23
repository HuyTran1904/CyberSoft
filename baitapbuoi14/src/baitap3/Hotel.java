package baitap3;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    List<HotelRoom> roomList;

    public Hotel(){
        this.roomList = new ArrayList<>();
    }

    public void addRoom(HotelRoom room){
        roomList.add(room);
    }

    public void search_room(int capacity) {
        for (HotelRoom room : roomList) {
            if (room.getStatus().equalsIgnoreCase("trống") && room.getCapacity() >= capacity) {
                System.out.println("Phòng phù hợp: " + room.getRoom_number() + " (sức chứa " + room.getCapacity() + " người)");
                room.book_room();
                return;
            }
        }
        System.out.println("Không tìm thấy phòng phù hợp.");
    }

    public double calculate_revenue() {
        double revenue = 0;
        for (HotelRoom room : roomList) {
            if (room.getStatus().equalsIgnoreCase("đã đặt")) {
                revenue += room.getPrice_per_night();
            }
        }
        return revenue;
    }
}
