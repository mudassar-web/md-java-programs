/**
 *
 * @author Mudassar
 */

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        double principle,rate,period,interest;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter principle amount:");
        principle=sc.nextDouble();
        System.out.println("Enter rate of interest:");
        rate=sc.nextDouble();
        System.out.println("Enter period:");
        period=sc.nextDouble();
        interest=principle*rate*period;
        System.out.println("Interest:"+interest);

    }
}