package bai5;

import java.util.Scanner;

public class Main {
    public static void main (String[] agrs){

        //đầu vào
        Scanner sc = new Scanner(System.in);
        System.out.print("Vui lòng nhập vào °C: ");
        double doC = sc.nextDouble();

        //code xử lí
        double doF = (doC * 1.8) + 32;

        //đầu ra
        System.out.print(doC+"°C" + " Đổi sang °F là: " + doF+"°F");
    }
}
