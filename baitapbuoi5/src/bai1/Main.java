package bai1;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập vào số nguyên m: ");
        int m = sc.nextInt();

        System.out.print("Nhập vào số nguyên n: ");
        int n = sc.nextInt();

        String kq = (m > n) ? "Số nguyên lớn nhất là " + m : "Số nguyên lớn nhất là: " + n;

        System.out.print(kq);
    }
}
