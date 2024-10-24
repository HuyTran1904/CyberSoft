package baitapvongfor.bai3;

public class Main {
    public static void main (String[] agrs){
        int dem = 0;
        for (int i = 0; i <= 1000; i++){

            if(i % 3 == 0){
                dem++;
            }
        }
        System.out.print("Có " + dem + " số chia hết cho 3 từ 0 - 1000 vòng for");

        int i = 0;
        int demSo = 0;
        while (i <= 1000){

            if(i % 3 == 0){
                demSo++;
            }
            i++;
        }
        System.out.print("\nCó " + demSo + " số chia hết cho 3 từ 0 - 1000 vòng while");
    }
}
