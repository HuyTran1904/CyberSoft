package baitap3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        Scanner scanner = new Scanner(System.in);
        int choice;

        // Thêm phòng mẫu
        hotel.addRoom(new HotelRoom(101, 2, 500.0, "trống"));
        hotel.addRoom(new HotelRoom(103, 4, 1000.0, "trống"));
        hotel.addRoom(new HotelRoom(104, 1, 300.0, "trống"));
        hotel.addRoom(new HotelRoom(106, 3, 800.0, "trống"));

        do {
            System.out.println("\n=== Quản lý khách sạn ===");
            System.out.println("1. Đặt phòng");
            System.out.println("2. Trả phòng");
            System.out.println("3. Tính doanh thu");
            System.out.println("4. Tìm phòng trống theo sức chứa yêu cầu");
            System.out.println("5. Thoát");
            System.out.print("Vui lòng chọn chức năng: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Nhập số phòng muốn đặt: ");
                    int roomNumberToBook = scanner.nextInt();
                    boolean roomFound = false;
                    for (HotelRoom room : hotel.roomList) {
                        if (room.getRoom_number() == roomNumberToBook) {
                            room.book_room();
                            roomFound = true;
                            break;
                        }
                    }
                    if (!roomFound) {
                        System.out.println("Phòng không tồn tại hoặc không còn trống.");
                    }
                    break;
                case 2:
                    System.out.print("Nhập số phòng muốn trả: ");
                    int roomNumber = scanner.nextInt();
                    boolean found = false;
                    for (HotelRoom room : hotel.roomList) {
                        if (room.getRoom_number() == roomNumber) {
                            room.checkout();
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Phòng không tồn tại.");
                    }
                    break;
                case 3:
                    double revenue = hotel.calculate_revenue();
                    System.out.println("Doanh thu hiện tại: " + revenue + " VND");
                    break;
                case 4:
                    System.out.print("Nhập số người: ");
                    int capacity = scanner.nextInt();
                    hotel.search_room(capacity);
                    break;
                case 5:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                    break;
            }
        } while (choice != 5);

        scanner.close();
    }
}