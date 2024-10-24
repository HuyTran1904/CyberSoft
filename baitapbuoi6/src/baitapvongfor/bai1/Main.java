package baitapvongfor.bai1;

public class Main {
    public static void main (String[] agrs){
        //vòng for
        System.out.print("Tất cả số nguyên dương chẵn nhỏ hơn 100: ");
        for (int i = 0; i < 100; i += 2){
            System.out.print(i + " " );
        }

        System.out.print("\nTất cả số nguyên dương lẻ nhỏ hơn 100: ");
        for (int i = 1; i < 100; i += 2){
            System.out.print(i + " ");
        }

        //vòng while
        int i = 0;
        System.out.print("\nTất cả số nguyên dương chẵn nhỏ hơn 100: ");
        while (i < 100){
            if(i % 2 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }

        i = 1;
        System.out.print("\nTất cả số nguyên dương lẻ nhỏ hơn 100: ");
        while (i < 100){
            if(i % 2 != 0) {
                System.out.print(i + " ");
            }
            i++;
        }
    }
}
