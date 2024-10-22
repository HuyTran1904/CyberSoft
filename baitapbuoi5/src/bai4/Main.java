package bai4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập vào số nguyên có hai chữ số (10-99): ");
        int n = sc.nextInt();

        if (n < 10 || n > 99) {
            System.out.println("Vui lòng nhập số có hai chữ số.");
            return;
        }

        int hangChuc = n / 10;
        int hangDV = n % 10;

        String chuc = "";
        String donVi = "";

        switch (hangChuc) {
            case 1:
                chuc = "Mười";
                break;
            case 2:
                chuc = "Hai mươi";
                break;
            case 3:
                chuc = "Ba mươi";
                break;
            case 4:
                chuc = "Bốn mươi";
                break;
            case 5:
                chuc = "Năm mươi";
                break;
            case 6:
                chuc = "Sáu mươi";
                break;
            case 7:
                chuc = "Bảy mươi";
                break;
            case 8:
                chuc = "Tám mươi";
                break;
            case 9:
                chuc = "Chín mươi";
                break;
        }

        switch (hangDV) {
            case 1:
                if (hangChuc == 1){
                    donVi = "một";
                } else {
                    donVi = "mốt";
                }
                break;
            case 2:
                donVi = "hai";
                break;
            case 3:
                donVi = "ba";
                break;
            case 4:
                donVi = "bốn";
                break;
            case 5:
                donVi = "lăm";
                break;
            case 6:
                donVi = "sáu";
                break;
            case 7:
                donVi = "bảy";
                break;
            case 8:
                donVi = "tám";
                break;
            case 9:
                donVi = "chín";
                break;
        }

        String kq = chuc;
        if (hangDV != 0) {
            kq += " " + donVi;
        }

        System.out.println("Cách đọc của số: " + kq);
    }
}
