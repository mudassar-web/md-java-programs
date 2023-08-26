/**
 *
 * @author Mudassar
 */

import java.util.Scanner;

public class Divisibility2or3Check {
    public static void main(String[] args) {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        num=sc.nextInt();
        if(num%2==0 || num%3==0)
        {
            System.out.println("Divisible");
        }
        else
        {
            System.out.println("Not divisible");
        }
    }
}