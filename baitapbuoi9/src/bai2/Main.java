package bai2;
//không thể tạo phương thức khác bên trong phương thức main
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<Student> studentList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] agrs){
        studentInformation();
        int choice;
        do {
            System.out.println("\n--- MENU QUẢN LÝ SINH VIÊN ---");
            System.out.println("1. In danh sách sinh viên");
            System.out.println("2. In sinh viên có ĐTB cao nhất");
            System.out.println("3. In danh sách sinh viên yếu");
            System.out.println("4. Tìm sinh viên theo tên");
            System.out.println("5. Tìm sinh viên theo mã");
            System.out.println("6. Xóa sinh viên theo mã");
            System.out.println("0. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice){
                case 1:
                    printStudent();
                    break;
                case 2:
                    printHighestAvg();
                    break;
                case 3:
                    printWeakStudent();
                    break;
                case 4:
                    findByName();
                    break;
                case 5:
                    findById();
                    break;
                case 6:
                    removeStudentById();
                    break;
                case 0:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
            }
        }while (choice != 0);
    }


    public static void studentInformation(){
        studentList.add(new Student("Nguyen Van A" , "1", 7,8,9));
        studentList.add(new Student("Nguyen Van B" , "2", 4,5,9));
        studentList.add(new Student("Nguyen Van C" , "3", 8.5,4.5,9.5));
        studentList.add(new Student("Nguyen Van D" , "4", 1.2,2.3,3.4));
    }

    public static void printStudent(){
        for (Student stu : studentList){
            System.out.println(stu);
        }
    }

    public static void printHighestAvg(){
        Student highestAvg = studentList.get(0);
        for (Student stu : studentList){
            if (stu.avgScore > highestAvg.avgScore){
                highestAvg = stu;
            }
        }
        System.out.print("Sinh viên có điểm trung bình cao nhất là: " + highestAvg);
    }

    public static void printWeakStudent(){
        boolean find = false;
        for (Student stu : studentList){
            if(stu.classifyStudent().equals("Yếu")){
                find = true;
                System.out.print(stu);
            }
        }
        if(!find) {
            System.out.print("Không có sinh viên yếu");
        }
    }

    public static void findByName(){
        System.out.print("Nhập tên cần tìm: ");
        String fName = sc.nextLine();
        boolean find = false;
        for (Student stu : studentList){
            if(stu.getName().equalsIgnoreCase(fName)){
                find = true;
                System.out.print(stu);
            }
        }
        if(!find){
            System.out.print("Tên sinh viên cần tìm không tồn tại");
        }
    }

    public static void findById(){
        System.out.print("Nhập mã sinh viên cần tìm: ");
        String fId = sc.nextLine();
        boolean find = false;
        for(Student stu : studentList){
            if(stu.getStudentId().equalsIgnoreCase(fId)){
                find = true;
                System.out.print(stu);
            }
        }
        if(!find){
            System.out.print("Không tìm thấy sinh viên");
        }
    }

    public static void removeStudentById(){
        System.out.print("Nhập mã sinh viên cần xóa: ");
        String id = sc.nextLine();
        boolean removed = false;
        for (int i = 0; i < studentList.size(); i++){
            if(studentList.get(i).getStudentId().equalsIgnoreCase(id)){
                studentList.remove(i);
                removed = true;
                System.out.println("Đã xóa sinh viên có mã: " + id);
                break;
            }
        }
        if (!removed){
            System.out.print("Không tìm thấy sinh viên có mã: " + id);
        }
    }


}
