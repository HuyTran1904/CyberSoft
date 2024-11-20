package baitap3;

import java.util.Scanner;

public class Main {
    public static void main(String[] agrs){
        BankAccount b1 = new BankAccount(123, 12.000);
        Scanner sc = new Scanner(System.in);
        boolean isRunning = true;

        while (isRunning){
            System.out.println("-----BANK-----");
            System.out.println("1. Nạp tiền");
            System.out.println("2. Rút tiền");
            System.out.println("3. Hiển thị số dư");
            System.out.println("4. Thoát");
            int choose = sc.nextInt();

            switch (choose){
                case 1:
                    System.out.println("Nhập số tiền muốn nạp: ");
                    double depositAmount = sc.nextDouble();
                    b1.deposit(depositAmount);
                    break;

                case 2:
                    System.out.println("Nhập số tiền muốn rút: ");
                    double withdrawAmount = sc.nextDouble();
                    b1.withdraw(withdrawAmount);
                    break;

                case 3:
                    System.out.println(b1.display_balance());
                    break;

                case 4:
                    isRunning = false;
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ");
            }
        }

    }
}
