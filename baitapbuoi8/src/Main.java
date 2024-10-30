import java.util.Scanner;

public class Main {
    public static int findMax(int a, int b, int c){
        if(a < b){
            int temp = b;
            b = a;
            a = temp;
        }
        if(a < c){
            int temp = c;
            c = a;
            a = temp;
        }
        if(b < c){
            int temp = c;
            c = b;
            b = temp;
        }
        return a;
    }

    public static String evenOrOdd(int d){
        if(d % 2 == 0){
            return d + " là số chẵn";
        } else {
            return d + " là số lẻ";
        }
    }

    public static int sum(int a, int b, int c){
        return a + b + c;
    }

    public static int add(int e, int f){
        return e + f;
    }

    public static int minus(int e, int f){
        return e - f;
    }

    public static int multiply(int e, int f){
        return e * f;
    }

    public static double divide(int e, int f) {
        return (double) e / f;
    }

    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số nguyên a: ");
        int a = sc.nextInt();

        System.out.print("Nhập vào số nguyên b: ");
        int b = sc.nextInt();

        System.out.print("Nhập vào số nguyên c: ");
        int c = sc.nextInt();

        int max = findMax(a,b,c);
        System.out.print("Số lớn nhất trong 3 số là: " + max);

        System.out.print("\nNhập vào số nguyên để kiểm tra chẵn lẻ: " );
        int d = sc.nextInt();
        String message = evenOrOdd(d);
        System.out.print(message);

        int sum = sum(a,b,c);
        System.out.print("\nTổng 3 số do người dùng nhập vào là: " + sum);

        int e, f;
        do {
            System.out.print("\nNhập vào số nguyên thứ nhất (khác 0): ");
            e = sc.nextInt();
            if (e == 0) {
                System.out.println("Số nhập vào phải khác 0. Vui lòng nhập lại.");
            }
        } while (e == 0);

        // Yêu cầu nhập số khác 0 cho b
        do {
            System.out.print("Nhập vào số nguyên thứ hai (khác 0): ");
            f = sc.nextInt();
            if (f == 0) {
                System.out.println("Số nhập vào phải khác 0. Vui lòng nhập lại.");
            }
        } while (f == 0);

        System.out.println("Chọn phép tính:");
        System.out.println("1: Cộng");
        System.out.println("2: Trừ");
        System.out.println("3: Nhân");
        System.out.println("4: Chia");

        System.out.print("Lựa chọn: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Kết quả của " + e + " + " + f + " là: " + add(e, f));
                break;
            case 2:
                System.out.println("Kết quả của " + e + " - " + f + " là: " + minus(e, f));
                break;
            case 3:
                System.out.println("Kết quả của " + e + " * " + f + " là: " + multiply(e, f));
                break;
            case 4:
                System.out.println("Kết quả của " + e + " / " + f + " là: "+ divide(e, f));
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ ");
        }
    }
}
