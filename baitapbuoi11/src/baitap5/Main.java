package baitap5;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Nguyễn Văn A", 30, 5000.0);

        Manager manager = new Manager("Trần Thị B", 40, 8000.0, "Kế toán");

        System.out.println("--- Thông tin Employee ---");
        employee.displayInfo();

        System.out.println("\n--- Thông tin Manager ---");
        manager.displayInfo();
    }
}