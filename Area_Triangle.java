/**
 *
 * @author Mudassar
 */

import java.util.Scanner;

public class Area_Triangle {
    public static void main(String[] args) {
        double base,height;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter base and height:");
        base=sc.nextDouble();
        height=sc.nextDouble();
        System.out.println("Area of triangle:"+(0.5*base*height));
    }
}