/**
 *
 * @author Mudassar
 */

import java.util.Scanner;

public class AlgebricExpression {
    public static void main(String[] args) {
        int a,b,c;
        double r;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter values for a, b and c:");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        r=6.5*Math.pow(a+b,2)-7.3*Math.pow(b+c,0.5)/Math.pow(a+c,0.5);
        System.out.println(r);
    }
}