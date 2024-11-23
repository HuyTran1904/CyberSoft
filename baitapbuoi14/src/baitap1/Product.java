package baitap1;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private int id;
    private String name;
    private double price;
    private int quantity;

    public Product(int id, String name, double price, int quantity){
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void calculate_discounted_price(double discount_rate){
        double discount = price - (price * (discount_rate / 100.0));
        System.out.println("Giá sau khi giảm: " + discount);
    }

    public String toString() {
        return "Product {ID: " + id + ", Name: " + name + ", Price: " + price +
                ", Quantity: " + quantity + "}";
    }
}
