package tasklab2;

public class TaskLab2 {

    public static void main(String[] args) {
       Product [] arr=new Product[3];
        arr[0]=new Book();
        arr[1]=new ChildrenBook();
        arr[2]=new Cartoon();
        arr[0].setPrice(55.8);
        arr[1].setPrice(80.5);
        arr[1].setDiscount(20);
        arr[2].setPrice(60);
        arr[2].setDiscount(10.5);
        double sum=(arr[0].getPrice()+arr[1].getPriceAfterDiscount()+arr[2].getPriceAfterDiscount());
        System.out.println("The sum of Prices of all books is : "+sum);
    }
    
}
