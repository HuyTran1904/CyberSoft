package baitapvongfor.bai2;

import java.util.Scanner;

public class Main {
    public static void main (String[] agrs){
        Scanner sc = new Scanner(System.in);
        //vòng for
        System.out.print("Nhập vào số nguyên n: ");
        int n = sc.nextInt();

        int sum = 0;
        for(int i = 2; i <= n; i += 2){
            sum += i;
        }
        System.out.print("Tổng các số chẵn từ 1 đến n vòng for là: " + sum );

        //vòng while
        int tong = 0;
        int i = 2;

        while(i <= n){
            tong += i;
            i += 2;
        }
        System.out.print("\nTổng các số chẵn từ 1 đến n vòng while là: " + tong);
    }
}
