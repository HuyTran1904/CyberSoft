package baitap1;

public class Laptop extends Product{
    private String processor;
    private String ram;
    public Laptop(int id, String name, double price, int quantity, String processor, String ram){
        super(id, name, price, quantity);
        this.processor = processor;
        this.ram = ram;
    }

    public void calculate_discounted_price(double discount_rate){
        double discount = getPrice() - (getPrice() * (discount_rate * 0.01)) + 50000;
        System.out.println("Giảm sau khi giảm: " + discount);
    }

    @Override
    public String toString() {
        return "Laptop {" + super.toString() + ", Processor: " + processor + ", RAM: " + ram + "}";
    }

}
