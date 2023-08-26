/**
 *
 * @author Mudassar
 */

import java.util.Scanner;

public class Divisibility5Check {
    public static void main(String[] args) {
        int num,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        num=sc.nextInt();
        if(num%5==0)
        {
            System.out.println("Divisible");
        }
        else
        {
            for(i=num-1;;i--)
            {
                if (i % 5 == 0) {
                    System.out.println(i);
                    break;
                }

            }
            for(i=num+1;;i++) {
                if (i % 5 == 0) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}