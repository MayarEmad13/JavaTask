
package tasklab1;

public class Book extends Product {
    void setPrice(double p)
    {
        price=p;
    }
    double getPrice()
    {
        return price;
    }
    void setName(String s)
    {
        name=s;
    }
    String getName()
    {
        return name;
    }
    void setDiscount(double amount)
    {
        price=price-amount;
    }
    double getPriceAfterDiscount()
    {
        return price;
    }
}
