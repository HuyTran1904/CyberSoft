public class Car extends Transportation{
    public Car(String manufacturer, String color, int year) {
        super(manufacturer, color, year);
    }

    @Override
    public void print() {
        System.out.println("--THÔNG TIN XE HƠI--");
        super.print();
    }
}
