package bai6;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] agrs){
        // Đầu vào
        Scanner sc = new Scanner(System.in);
        System.out.print("Vui lòng nhập vào số USD bạn muốn đổi: ");
        double usd = sc.nextDouble();

        // Code xử lí
        double vnd = usd * 23500;

        // Định dạng số
        DecimalFormat formatter = new DecimalFormat("#,###");
        String formattedVnd = formatter.format(vnd);

        // Đầu ra
        System.out.println(usd + " USD đổi sang VNĐ là: " + formattedVnd + " VNĐ");
    }
}
