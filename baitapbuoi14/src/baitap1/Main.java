package baitap1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] agrs){
        List<Product> productList = new ArrayList<Product>();
        Laptop a1 = new Laptop(1,"ideapad 5 pro", 120.000, 12, "intel core i5", "16gb");
        Smartphone a2 = new Smartphone(2, "iphone 20 pro max ultra", 300.000, 13, "100MP");
        Tablet a3 = new Tablet(3, "iPad 9 WiFi", 900.000, 15, "1620 x 2160 Pixels");

        productList.add(a1);
        productList.add(a2);
        productList.add(a3);


        for (Product product : productList) {
            System.out.println(product);
            product.calculate_discounted_price(50);
        }
    }
}
