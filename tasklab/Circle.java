package tasklab;

public class Circle {
    private double radius;
    private String color;
    private double pi=22/7;
    public Circle()
    {
        System.out.println("welcome to Circle class");
    }
    public Circle(double r)
    {
        radius=r;
    }
    public Circle(double r,String c)
    {
        radius=r;
        color=c;
    }
    public void setRadius(double radius)
    {
        this.radius=radius;
    }
    public double getRadius()
    {
        return radius;
    }
    public void setColor(String color)
    {
        this.color=color;
    }
    public String getColor()
    {
        return color;
    }
    public double getArea()
    {
        return (pi*radius*radius);
    }
}
