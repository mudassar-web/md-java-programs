/**
 *
 * @author Mudassar
 */

import java.util.*;
public class ArgEx
{
    static double pi=3.14;    
    
    public static void main(String arg[])
    {
        int a=Integer.parseInt(arg[0]);
        int b=Integer.parseInt(arg[1]);
        int c=Integer.parseInt(arg[2]);
        int sum=a+b+c;
        System.out.println("Sum:"+sum);
    }
}