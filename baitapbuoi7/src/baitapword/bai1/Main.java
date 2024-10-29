package baitapword.bai1;

import java.util.Scanner;

public class Main {
    public static void main (String[] agrs){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số nguyên n: ");
        int n = sc.nextInt();

        //bai1
        if(n > 0){
            System.out.print("Đây là số nguyên dương ");
        } else {
            System.out.print("Đây là số nguyên âm ");
        }

        //bai1.1
        if(n % 2 == 0){
            System.out.print("\nSố chẵn ");
        } else {
            System.out.print("\nSố lẻ ");
        }

        //bai1.2
        boolean isPrime = true;
        if(n <= 1){
           isPrime = false;
        } else {
            for(int i = 2; i < n / 2; i++){
                if (n % i == 0){
                    isPrime = false;
                    break;
                }
            }
        }

        if(isPrime){
            System.out.print("\n" + n + " là số nguyên tố");
        } else {
            System.out.print("\n" + n + " không phải là số nguyên tố");
        }

    }
}
