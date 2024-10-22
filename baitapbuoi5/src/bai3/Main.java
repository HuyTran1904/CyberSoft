package bai3;

import java.util.Scanner;

public class Main {
    public static void main (String[] agrs ) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Vui lòng nhập vào số nguyên thứ 1: ");
        int a = sc.nextInt();

        System.out.print("Vui lòng nhập vào số nguyên thứ 2: ");
        int b = sc.nextInt();

        System.out.print("Vui lòng nhập vào số nguyên thứ 3: ");
        int c = sc.nextInt();

        int temp;

        System.out.print("Chọn 1 nếu bạn muốn sắp xếp theo thứ tự tăng dần\n");
        System.out.println("Chọn 2 nếu bạn muốn sắp xếp theo thứ tự giảm dần");
        int choose = sc.nextInt();

        switch (choose) {
            case 1:
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
                System.out.print("Sắp xếp theo thứ tự tăng dần: " + a + b + c);
                break;
            case 2:
                if (a < b)  {
                    temp = a;
                    a = b;
                    b = temp;
                }

                if (a < c) {
                    temp = a;
                    a = c;
                    c = temp;
                }


                if (b < c) {
                    temp = b;
                    b = c;
                    c = temp;
                }
                System.out.print("Sắp xếp theo thứ tự giảm dần: " + a + b + c);
                break;
        }


    }
}
