/**
 *
 * @author Mudassar
 */

class Outer
{
    int o=75;
    class Inner
    {
        int i=45;
    } 
}
class Outer1
{
    int o=75;
    static class Inner1
    {
        int i=45;
    } 
}
public class Outer_Inner_Demo
{
    public static void main(String arg[])
    {
        //Non-Static
        Outer obj=new Outer();
        System.out.println("Value of outer: "+obj.o);
        System.out.println("Value of inner: "+new Outer().new Inner().i);
        //Static
        Outer1 obj1=new Outer1();
        System.out.println("Value of outer: "+obj1.o);
        System.out.println("Value of inner: "+new Outer1.Inner1().i);
    }
}
