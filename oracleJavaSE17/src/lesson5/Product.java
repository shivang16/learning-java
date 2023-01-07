package lesson5;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Product {
    private final String id;
    private final String name;
    private final BigDecimal price;

    private Rating rating;

    public Product() {
        this("0","no name",BigDecimal.ZERO);
    }

    public Rating getRating() {
        return rating;
    }

    public Product(String id, String name, BigDecimal price, Rating rating) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public Product(String id, String name, BigDecimal price) {
        this(id,name,price,Rating.NOT_RATED);
    }

    public static final BigDecimal DISCOUNT_RATE = new BigDecimal(0.1);
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public BigDecimal calculateDiscount(){
        return DISCOUNT_RATE.multiply(price).setScale(2, RoundingMode.HALF_UP);
    }

    public void printDetails(){
        System.out.println("Id: "+id+"\tName: "+name+"\tPrice: "+price+"\tRating: "+rating.getStars());
    }

    public Product applyRating(Rating newRating){
        return new Product(id,name,price,newRating);
    }
}