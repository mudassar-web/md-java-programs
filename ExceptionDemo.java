/**
 *
 * @author Mudassar
 */

import java.util.Scanner;

public class ExceptionDemo
{
    public static void main(String args[])
    {
        try
        {
        int a,b;
        float ans;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        a=sc.nextInt();
        System.out.println("Enter number");
        b=sc.nextInt();
        ans=(float)a/b;
        System.out.println("Answer:"+ans);
        }
        catch(java.util.InputMismatchException me)
        {
            System.out.println("Enter only integers");
        }
        catch(NumberFormatException ne)
        {
            System.out.println("Error");
        }
        finally
        {
            System.out.println("Program created by ABU.");
        }
    
    }
}