package baitapword.bai3;

import java.util.Scanner;

public class Main {
    public static void main (String[] agrs){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số nguyên dương n: ");
        int n = sc.nextInt();

        int sum = 0;
        for(int i = 0; i <= n; i++){
            if(i % 2 == 0){
                sum += i;
            }
        }
        System.out.print("Tổng các số chẵn từ 0 - n là: " + sum);
    }
}
