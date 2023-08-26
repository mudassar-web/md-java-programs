/**
 *
 * @author Mudassar
 */

class Outer
{
    int radius;
    void getdata(int r)
    {   
        radius=r;
    }
    class Inner
    {
        void display()
        {
            getdata(5);
            System.out.println(radius);
        }
    }
}

public class Outer_Inner
{
    public static void main(String[] args)
    {
        Outer.Inner obj=new Outer().new Inner();            
        //obj.display();
    }
}