package baitap4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        library.addBook(new Book("Sach 1", "Nguyễn Văn A"));
        library.addBook(new Book("Sach 2", "Trần Văn B"));
        library.addBook(new Book("Sach 3", "Lê Thị C"));

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Hiển thị danh sách sách có sẵn");
            System.out.println("2. Mượn sách");
            System.out.println("3. Trả sách");
            System.out.println("4. Thoát");
            System.out.print("Chọn một tùy chọn: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    library.displayAvailableBooks();
                    break;
                case 2:
                    System.out.print("Nhập tựa sách muốn mượn: ");
                    String borrowTitle = scanner.nextLine();
                    library.borrowBook(borrowTitle);
                    break;
                case 3:
                    System.out.print("Nhập tựa sách muốn trả: ");
                    String returnTitle = scanner.nextLine();
                    library.returnBook(returnTitle);
                    break;
                case 4:
                    System.out.println("Thoát chương trình.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Tùy chọn không hợp lệ. Vui lòng thử lại.");
            }
        }

    }
}