package tasklab;

public class TaskLab {

    public static void main(String[] args) {
       Cylinder obj=new Cylinder();
       obj.setRadius(3.0);
       obj.setHeight(5.0);
       System.out.println(obj.getVolume());
    }
    
}
