/**
 *
 * @author Mudassar
 */

import java.util.Scanner;

public class Area_Circumferenc_Circle {
    final static double pi = 3.14;

    public static void main(String[] args) {
        double radius;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius:");
        radius=sc.nextInt();
        System.out.println("Circumference:"+(2*pi*radius));

        System.out.println("Area:"+pi*radius*radius);


    }
}