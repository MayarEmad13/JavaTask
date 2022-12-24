package tasklab1;

public class TaskLab1 {

    public static void main(String[] args) {
        Product [] arr=new Product[3];
        arr[0]=new Book();
        arr[1]=new ChildrenBook();
        arr[2]=new Book();
        arr[0].setPrice(55.8);
        arr[1].setPrice(80.5);
        arr[1].setDiscount(20);
        arr[2].setPrice(60);
        double sum=(arr[0].getPrice()+arr[1].getPriceAfterDiscount()+arr[2].getPrice());
        System.out.println(sum);
    }
    
}
