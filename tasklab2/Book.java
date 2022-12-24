
package tasklab2;

public class Book implements Product {
    double price1;
    String name1;
    public void setPrice(double p)
    {
        price1=p;
    }
    public double getPrice()
    {
        return price1;
    }
    public void setName(String s)
    {
        name1=s;
    }
    public String getName()
    {
        return name1;
    }
    public void setDiscount(double amount)
    {
        price1=price1-amount;
    }
    public double getPriceAfterDiscount()
    {
        return price1;
    }
}
