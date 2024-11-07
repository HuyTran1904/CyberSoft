public class Motorbike extends Transportation {
    public Motorbike(String manufacturer, String color, int year){
        super(manufacturer,color,year);
    }

    public void print(){
        System.out.println("--THÔNG TIN XE MÁY--");
        super.print();
    }
}
