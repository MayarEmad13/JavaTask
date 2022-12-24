package tasklab1;

public abstract class Product {
    double price;
    String name;
    abstract void setPrice(double p);
    abstract void setName(String s);
    abstract void setDiscount(double amount);
    abstract double getPrice();
    abstract String getName();
    abstract double getPriceAfterDiscount();
}
