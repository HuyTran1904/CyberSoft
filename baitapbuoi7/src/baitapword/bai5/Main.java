package baitapword.bai5;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();

        System.out.print("Nhập số phần tử trong mảng: ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            int element = sc.nextInt();
            arr.add(element);
        }

        int max = arr.get(0);
        int min = arr.get(0);

        for(int i = 1; i < arr.size(); i++){
            if(max < arr.get(i)){
                max = arr.get(i);
            }
            if(min > arr.get(i)){
                min = arr.get(i);
            }
        }
        System.out.println("Số lớn nhất trong mảng là: " + max);
        System.out.println("Số nhỏ nhất trong mảng là: " + min);
    }
}
