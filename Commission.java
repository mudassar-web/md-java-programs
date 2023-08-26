/**
 *
 * @author Mudassar
 */

import java.util.Scanner;

public class Commission {
    public static void main(String[] args) {
        int salary;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter salary:");
        salary=sc.nextInt();
        if(salary<=20000)
        {
            System.out.println("Rate of commission:3%");
            System.out.println("sales with commission:"+(salary+(salary*3)/100));
        }
        else if (salary>20000&&salary<=50000)
        {
            System.out.println("Rate of commission:15%");
            System.out.println("sales with commission:"+(salary+(salary*15)/100));
        }
        else if(salary>=50001)
        {
            System.out.println("Rate of commission:31%");
            System.out.println("sales with commission:"+(salary+(salary*31)/100));

        }
    }
}