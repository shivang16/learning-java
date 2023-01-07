package lesson4;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Product {
    private String id;
    private String name;
    private BigDecimal price;

    public static final BigDecimal DISCOUNT_RATE = new BigDecimal(0.1);
    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(final BigDecimal price) {
        this.price = price;
    }

    public BigDecimal calculateDiscount(){
        return DISCOUNT_RATE.multiply(price).setScale(2, RoundingMode.HALF_UP);
    }
}