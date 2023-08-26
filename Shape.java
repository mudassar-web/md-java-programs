/**
 *
 * @author Mudassar
 */

public class Shape {
    double length,breadth,height,radius;
    int s;
    public void rectangle(double l,double b)
    {
        length=l;
        breadth=b;
    }
    public void triangle(double l,double b,double h)
    {
        length=l;
        breadth=b;
        height=h;
    }
    public void circle(double r)
    {
        radius=r;
    }
    public void area(int s1)
    {
        s=s1;
        if(s==0)
        {
            System.out.println("Area of rectangle:"+(length*breadth));
        }
        else if(s==1)
        {
            System.out.println("Area of triangle:"+(0.5*length*breadth*height));
        }
        else
        {
            System.out.println("Area of circle:"+(3.14*radius*radius));
        }
    }
}