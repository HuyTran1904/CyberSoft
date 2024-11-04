package bai1;

import java.util.Scanner;

public class Main {

    public static double calculateAverage(double math, double physic, double chemistry) {
        return (math + physic + chemistry) / 3;
    }

    public static String classifyStudent(double average) {
        if (average >= 9) {
            return "Xuất Sắc";
        } else if (average >= 8) {
            return "Giỏi";
        } else if (average >= 7) {
            return "Khá";
        } else if (average >= 5 ) {
            return "Trung Bình";
        } else {
            return "Yếu";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập tên sinh viên: ");
        String name = scanner.nextLine();

        System.out.print("Nhập mã sinh viên: ");
        int studentId = scanner.nextInt();

        if(studentId <= 0){
            System.out.print("Mã sinh viên phải lớn hơn 0");
            return;
        }

        System.out.print("Nhập điểm Toán: ");
        double mathScore = scanner.nextDouble();

        System.out.print("Nhập điểm Lý: ");
        double physicScore = scanner.nextDouble();

        System.out.print("Nhập điểm Hóa: ");
        double chemistryScore = scanner.nextDouble();

        if (mathScore > 10 || mathScore < 1 || physicScore > 10 ||physicScore < 1 || chemistryScore > 10 || chemistryScore < 1) {
            System.out.print("Điểm không hợp lệ");
            return;
        }

        double averageScore = calculateAverage(mathScore, physicScore, chemistryScore);

        String classification = classifyStudent(averageScore);

        System.out.println("\n--THÔNG TIN SINH VIÊN--");
        System.out.println("Tên: " + name);
        System.out.println("Mã SV: " + studentId);
        System.out.printf("Điểm trung bình: %.2f%n", averageScore);
        System.out.println("Xếp loại: " + classification);

    }
}
