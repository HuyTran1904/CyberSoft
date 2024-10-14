package bai2;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Viết chương trình tính giá trị đơn thức P(x) = ax^n với x = 8 cho trước
        //đầu vào
        int x = 8;
        Scanner sc = new Scanner(System.in);

        System.out.print("Vui lòng nhập vào số a (số thực): ");
        double a = sc.nextDouble();

        System.out.print("Vui lòng nhập vào số n (số nguyên không âm): ");
        int n = sc.nextInt();
        //code xử lí

        double kq = a * Math.pow(x,n);

        //đầu ra
        System.out.print("Kết quả của P(x) = ax^n là : " + kq);

    }
}