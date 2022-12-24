package tasklab2;

public class Cartoon extends Book {

    public void setDiscount(double amount) {
        price1 = price1 - amount;
    }

    public double getPriceAfterDiscount() {
        return price1;
    }

    public void setName(String s) {
        name1 = s;
    }

    public String getName() {
        return name1;
    }
}
