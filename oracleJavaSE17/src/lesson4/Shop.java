package lesson4;

import java.math.BigDecimal;

public class Shop {
    public static void main(String[] args) {
        Product p1 = new Product();
        p1.setId("1");
        p1.setName("Apple");
        p1.setPrice(BigDecimal.valueOf(12.000));
        System.out.println(p1.getId());
        System.out.println(p1.getName());
        System.out.println(p1.getPrice());
        System.out.println(p1.calculateDiscount());
    }
}
