package baitap2;

import java.util.Scanner;

public class Main {
    public static void main (String[] agrs){
        Scanner sc = new Scanner(System.in);
        System.out.print("Vui lòng nhập vào số n: ");
        double n = sc.nextDouble();
        double tong = 0;

        while (n > 0){
            tong += n;

            System.out.print("hãy nhập vào số n khác hoặc nhập vào số 0 hoặc số âm để dừng chương trình: ");
            n = sc.nextDouble();
        }
        System.out.print("Kết quả là: " + tong);
    }
}
