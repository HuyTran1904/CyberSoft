package baitap5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Flight flight = new Flight();


        flight.addSeat(new EconomySeat("E1", 100));
        flight.addSeat(new EconomySeat("E2", 100));
        flight.addSeat(new BusinessSeat("B1", 200));
        flight.addSeat(new BusinessSeat("B2", 200));
        flight.addSeat(new FirstClassSeat("F1", 300));
        flight.addSeat(new FirstClassSeat("F2", 300));

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Hiển thị danh sách ghế");
            System.out.println("2. Đặt ghế");
            System.out.println("3. Tính doanh thu");
            System.out.println("4. Thoát");
            System.out.print("Lựa chọn của bạn: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    flight.displaySeats();
                    break;
                case 2:
                    System.out.print("Nhập số ghế muốn đặt: ");
                    String seatNumber = scanner.nextLine();
                    flight.bookSeat(seatNumber);
                    break;
                case 3:
                    System.out.println("Tổng doanh thu: " + flight.calculateTotalRevenue());
                    break;
                case 4:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng thử lại.");
            }
        } while (choice != 4);

    }
}
