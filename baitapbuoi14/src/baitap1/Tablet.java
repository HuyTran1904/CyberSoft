package baitap1;

public class Tablet extends Product{
    private String resolution;
    public Tablet(int id, String name, double price, int quantity, String resolution){
        super(id, name, price, quantity);
        this.resolution = resolution;
    }

    public void calculate_discounted_price(double discount_rate){
        double discount = getPrice() - (getPrice() * (discount_rate * 0.01)) + 20000;
        System.out.println("Giảm sau khi giảm: " + discount);
    }

    @Override
    public String toString() {
        return "Tablet {" + super.toString() + ", Resolution: " + resolution + "}";
    }

}
