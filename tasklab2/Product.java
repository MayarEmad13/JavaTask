
package tasklab2;

public interface Product {
    void setPrice(double p);
    void setName(String s);
    void setDiscount(double amount);
    double getPrice();
    String getName();
    double getPriceAfterDiscount();
}
