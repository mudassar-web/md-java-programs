/**
 *
 * @author Mudassar
 */

import java.util.Scanner;

public class AcceptValues
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Roll no:");
        int roll=sc.nextInt();
        System.out.println("Enter Name:");
        String name=sc.next();
        System.out.println("Enter Percentage:");
        float per=sc.nextFloat();
        System.out.println("Roll no\tName\tPercentage");
        System.out.println(roll+"\t"+name+"\t"+per);       
    }
}