package bai3;

import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        //viết chương trình tính nhập vào số nguyên dương n với 2 ký số, tính và xất tổng 2 ký số của n
        //đầu vào
        Scanner sc = new Scanner(System.in);
        System.out.print("Vui lòng nhập vào số nguyên dương n với 2 ký số: ");
        int n = sc.nextInt();

        //code xử lí
        int hangChuc = n / 10;
        int hangDonVi = n % 10;
        int kq = hangChuc + hangDonVi;

        //đầu ra
        System.out.print("Tổng của 2 ký số của n là: " + kq);
    }
}
