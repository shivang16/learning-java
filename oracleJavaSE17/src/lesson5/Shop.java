package lesson5;

import java.math.BigDecimal;

public class Shop {
    public static void main(String[] args) {
        Product p1 = new Product("1","Apple",BigDecimal.valueOf(15.00),Rating.THREE_STAR);
        p1.printDetails();
        System.out.println("Discounted price is: "+p1.calculateDiscount());
        Product p2 = new Product("2","Tea",BigDecimal.valueOf(50));
        p2.printDetails();
        Product p3 = new Product("3","Mobile",BigDecimal.valueOf(10000),Rating.FOUR_STAR);
        p3.printDetails();
        Product p4 = new Product();
        p4.printDetails();
    }
}
