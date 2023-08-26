/**
 *
 * @author Mudassar
 */

import java.util.Scanner;

public class EvenOddCheck {
    public static void main(String[] args) {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        num=sc.nextInt();
        if(num%2==0)
        {
            System.out.println("No. is Even");
        }
        else
        {
            System.out.println("No. is Odd");
        }
    }
}
