package baitapword.bai4;

import java.util.Scanner;

public class Main {
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào n phần tử số nguyên: ");
        int n = sc.nextInt();

        int sumNumber = 0;
        int avrNumber = 0;
        for(int i = 0; i <= n; i++){
            sumNumber += i;
            avrNumber = sumNumber / n;
        }
        System.out.print("Giá trị trung bình của mảng này là: " + avrNumber);
    }
}
