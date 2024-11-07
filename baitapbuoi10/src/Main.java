//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            Student s1 = new Student("Nguyen Van A", 18, 7,8,9);
            Game g1 = new Game("Trò chơi");
            Motorbike m1 = new Motorbike("A", "xanh", 2024);
            Car c1 = new Car("B", "đỏ", 2025);
            AirConditioner a1 = new AirConditioner("Điều hòa DAIKIN", 1500, "Làm lạnh");
            Dryer d1 = new Dryer("Máy Sấy Electrolux", 800, "7 phút");

            s1.printStudent();
            g1.printGame();
            m1.print();
            c1.print();
            a1.ePrint();
            d1.ePrint();
        }
    }
