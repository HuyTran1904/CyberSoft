package baitapword.bai6;

import java.util.Scanner;

public class Main {
    public static int perimeter(int width) {
        return 4 * width;
    }

    public static int area(int width) {
        return width * width;
    }

    public static void main (String[] agrs){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào chiều rộng của hình vuông: ");
        int width = sc.nextInt();

        int calPerimeter = perimeter(width);
        int calArea = area(width);

        System.out.println("Diện tích hình vuông là: " + calArea);
        System.out.println("Chu vi hình vuông là: " + calPerimeter);
    }
}
