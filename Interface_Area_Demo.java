/**
 *
 * @author Mudassar
 */

public class Interface_Area_Demo {
    public static void main(String args[])
    {
        Interface_Circle circle=new Interface_Circle();
        Interface_Rectangle rectangle=new Interface_Rectangle();
        double a=circle.area(5,0);
        double b=rectangle.area(5 ,5);
        System.out.println("Area of circle:"+a+"\n"+"Area of rectangle:"+b);
    }
}