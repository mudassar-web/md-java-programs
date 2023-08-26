/**
 *
 * @author Mudassar
 */

class Complex
{
    float real,imag;
    Complex()
    {
        real=1;
        imag=1;
    }
    Complex(float real,float imag)
    {
        this.real=real;
        this.imag=imag;
    }
    void show()
    {
        System.out.println(real+"+"+imag+"i");
    }   
}

public class ComplexNoDemo
{
     
    public static void main(String arg[])
    {
        Complex c2;
        Complex c1=new Complex();
        
        //c1.setData(4f,5.6f);
        c1.show();        
        
        c2=new Complex(3f,4.5f);
        c2.show();
    }
}