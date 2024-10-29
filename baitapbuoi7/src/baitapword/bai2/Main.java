package baitapword.bai2;

import java.util.Scanner;

public class Main {
    public static void main (String[] agrs){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số nguyên từ 1 đến 10: ");
        int n = sc.nextInt();

        String printWord;

        switch (n) {
            case 1:
                printWord = "Một";
                break;
            case 2:
                printWord = "Hai";
                break;
            case 3:
                printWord = "Ba";
                break;
            case 4:
                printWord = "Bốn";
                break;
            case 5:
                printWord = "Năm";
                break;
            case 6:
                printWord = "Sáu";
                break;
            case 7:
                printWord = "Bảy";
                break;
            case 8:
                printWord = "Tám";
                break;
            case 9:
                printWord = "Chín";
                break;
            case 10:
                printWord = "Mười";
                break;
            default:
                printWord = "Số không hợp lệ";
                break;
        }
        System.out.println(n + " -> " + printWord);
    }
}
