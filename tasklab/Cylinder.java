package tasklab;

public class Cylinder extends Circle {
    double height;
    public Cylinder()
    {
        //super();
        System.out.println("welcome to Cylinder class");
    }
    public Cylinder(double r)
    {
        setRadius(r);
    }
    public Cylinder(double r,double h,String c)
    {
        setRadius(r);
        setColor(c);
        height=h;
    }
    public void setHeight(double h)
    {
        height=h;
    }
    public double getHeight()
    {
        return height;
    }
    public double getVolume()
    {
        return (super.getArea()*height);
    }
}
