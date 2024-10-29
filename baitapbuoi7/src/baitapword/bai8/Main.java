package baitapword.bai8;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();

        System.out.print("Nhập vào số lượng phần tử: ");
        int n = sc.nextInt();

        for(int i  = 0; i < n; i++){
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            int element = sc.nextInt();
            arr.add(element);
        }

        System.out.print("Các phần tử số chẵn là: ");
        for(int i  = 0; i < n; i++){
            if(arr.get(i) % 2 == 0){
                System.out.print(arr.get(i) + " ");
            }
        }
    }
}
