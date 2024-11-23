package baitap4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CheckingAccount checkingAccount = new CheckingAccount("CHK123", 200);
        SavingsAccount savingsAccount = new SavingsAccount("SAV456", 500);

        while (true) {
            System.out.println("--- MENU ---");
            System.out.println("1. Nạp tiền vào Tài khoản Thanh toán");
            System.out.println("2. Rút tiền từ Tài khoản Thanh toán");
            System.out.println("3. Hiển thị số dư Tài khoản Thanh toán");
            System.out.println("4. Nạp tiền vào Tài khoản Tiết kiệm");
            System.out.println("5. Rút tiền từ Tài khoản Tiết kiệm");
            System.out.println("6. Hiển thị số dư Tài khoản Tiết kiệm");
            System.out.println("7. Thoát");

            System.out.print("Chọn một tùy chọn: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Nhập số tiền nạp vào Tài khoản Thanh toán: ");
                    double depositChecking = scanner.nextDouble();
                    checkingAccount.deposit(depositChecking);
                    break;
                case 2:
                    System.out.print("Nhập số tiền rút từ Tài khoản Thanh toán: ");
                    double withdrawChecking = scanner.nextDouble();
                    checkingAccount.withdraw(withdrawChecking);
                    break;
                case 3:
                    checkingAccount.displayBalance();
                    break;
                case 4:
                    System.out.print("Nhập số tiền nạp vào Tài khoản Tiết kiệm: ");
                    double depositSavings = scanner.nextDouble();
                    savingsAccount.deposit(depositSavings);
                    break;
                case 5:
                    System.out.print("Nhập số tiền rút từ Tài khoản Tiết kiệm: ");
                    double withdrawSavings = scanner.nextDouble();
                    savingsAccount.withdraw(withdrawSavings);
                    break;
                case 6:
                    savingsAccount.displayBalance();
                    break;
                case 7:
                    System.out.println("Thoát chương trình.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }
}
