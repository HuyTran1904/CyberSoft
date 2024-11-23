package baitap3;

public class HotelRoom {
    private int room_number;
    private int capacity;
    private double price_per_night;
    private String status;

    public HotelRoom(int room_number, int capacity, double price_per_night, String status) {
        this.room_number = room_number;
        this.capacity = capacity;
        this.price_per_night = price_per_night;
        this.status = "trống";
    }

    public int getCapacity() {
        return capacity;
    }

    public double getPrice_per_night() {
        return price_per_night;
    }

    public String getStatus() {
        return status;
    }

    public int getRoom_number() {
        return room_number;
    }

    public void book_room() {
        if (status.equalsIgnoreCase("trống")) {
            status = "đã đặt";
            System.out.println("phòng " + room_number + " đã được đặt thành công");
        } else {
            System.out.println("phòng " + room_number + " không còn trống");
        }
    }

    public void checkout() {
        if (status.equalsIgnoreCase("đã đặt")) {
            status = "trống";
            System.out.println("phòng " + room_number + " đã được trả thành công");
        } else {
            System.out.println("phòng " + room_number + " hiện đã trống sẵn");
        }
    }
}
