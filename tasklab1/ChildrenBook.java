package tasklab1;

public class ChildrenBook extends Book {
     void setDiscount(double amount)
     {
         price=price-amount;
     }
     double getPriceAfterDiscount()
     {
         return price;
     }
}
