package baitap1;

public class Smartphone extends Product{
    private String camera_quantity;
    public Smartphone(int id, String name, double price, int quantity, String camera_quantity){
        super(id, name, price, quantity);
        this.camera_quantity = camera_quantity;
    }


    public void calculate_discounted_price(double discount_rate){
        double discount = getPrice() - (getPrice() * (discount_rate * 0.01)) + 10000;
        System.out.println("Giảm sau khi giảm: " + discount);
    }

    @Override
    public String toString() {
        return "Smartphone {" + super.toString() + ", Camera: " + camera_quantity + "}";
    }

}
