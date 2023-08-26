/**
 *
 * @author Mudassar
 */

import java.util.Scanner;

public class SalaryCalc {
    public static void main(String[] args) {
        int salary, calculated;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter salary:");
        salary=sc.nextInt();
        calculated=salary+((salary*15)/100)+((salary*15)/100)+((salary*10)/100);
        System.out.println("Total Salary:"+calculated);
    }
}