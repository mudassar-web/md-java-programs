/**
 *
 * @author Mudassar
 */

import java.util.Scanner;

public class TernaryOperatorEx {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three numbers:");
        a=sc.nextInt(); b=sc.nextInt();c=sc.nextInt();
        int test=(a>b && a>c)?a:b;
        int test2=test>c?test:c;
        if(test2!=test)
        {
            System.out.println(test2+" is greater");
        }
        else
        {
            System.out.println(test+" is greater");
        }
    }
}