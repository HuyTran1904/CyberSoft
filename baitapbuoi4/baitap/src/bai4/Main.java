package bai4;

import java.util.Scanner;

public class Main {
    public static void main (String[] agrs){

        //đầu vào
        Scanner sc = new Scanner(System.in);
        final int n = 5;

        System.out.print("Vui lòng nhập vào số nguyên thứ 1: ");
        int n1 = sc.nextInt();

        System.out.print("Vui lòng nhập vào số nguyên thứ 2: ");
        int n2 = sc.nextInt();

        System.out.print("Vui lòng nhập vào số nguyên thứ 3: ");
        int n3 = sc.nextInt();

        System.out.print("Vui lòng nhập vào số nguyên thứ 4: ");
        int n4 = sc.nextInt();

        System.out.print("Vui lòng nhập vào số nguyên thứ 5: ");
        int n5 = sc.nextInt();

        //code sử lí
        int sum = n1 + n2 + n3 + n4 + n5;
        double kq = (double) sum / n;

        //đầu ra
        System.out.print("Giá trị trung bình của 5 số là: " + kq);

    }
}
