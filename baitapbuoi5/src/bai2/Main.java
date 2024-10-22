package bai2;

import java.util.Scanner;

public class Main {
    public static void main (String[] agrs){
        Scanner sc = new Scanner(System.in);

        System.out.print("Vui lòng nhập vào số nguyên thứ 1: ");
        int a = sc.nextInt();

        System.out.print("Vui lòng nhập vào số nguyên thứ 2: ");
        int b = sc.nextInt();

        System.out.print("Vui lòng nhập vào số nguyên thứ 3: ");
        int c = sc.nextInt();

        int temp;

        if (a > b)  {
            temp = a;
            a = b;
            b = temp;
        }

        if (a > c) {
            temp = a;
            a = c;
            c = temp;
        }


        if (b > c) {
            temp = b;
            b = c;
            c = temp;
        }
        System.out.print("Xếp theo thứ tự tăng dần là : " + a + "," + b + "," + c);
    }
}
