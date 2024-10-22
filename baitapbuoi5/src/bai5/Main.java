package bai5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ai đang sử dụng máy (B: Bố, H: Mẹ, A: Anh trai, E: Em gái)? ");
        char user = sc.next().toUpperCase().charAt(0);

        switch (user) {
            case 'B':
                System.out.println("Chào Bố! ");
                break;
            case 'H':
                System.out.println("Chào Mẹ! ");
                break;
            case 'A':
                System.out.println("Chào Anh trai! ");
                break;
            case 'E':
                System.out.println("Chào Em gái! ");
                break;
            default:
                System.out.println("Không nhận diện được người đang sử dụng máy.");
                break;
        }
    }
}

