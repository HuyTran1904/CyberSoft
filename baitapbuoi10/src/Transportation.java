public class Transportation {
    String manufacturer;
    String color;
    int year;

    public Transportation(String manufacturer, String color, int year){
        this.color = color;
        this.year = year;
        this.manufacturer = manufacturer;
    }

    public void print(){
        System.out.println("Nhà sản xuất: " + manufacturer);
        System.out.println("Màu : " + color);
        System.out.println("Năm sản xuất: " + year);
    }
}
