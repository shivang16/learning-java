package lesson3;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Practice2 {
    public static void main(String[] args) {
        double price = 1.85;
        double rate = 0.065;
        price-=price*rate;
        price = Math.round(price*100)/100.0;
        System.out.println(price);

        BigDecimal dprice = new BigDecimal(1.85);
        BigDecimal drate = new BigDecimal(0.065);
        double numCustomer = 10000;
        dprice = dprice.subtract(dprice.multiply(drate)).setScale(2, RoundingMode.HALF_UP);
        System.out.println(dprice);
    }
}
