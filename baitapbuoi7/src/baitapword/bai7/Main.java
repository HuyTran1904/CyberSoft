package baitapword.bai7;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Nhập số lượng phần tử: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = random.nextInt(11);
        }

        System.out.println("Mảng vừa nhập:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
