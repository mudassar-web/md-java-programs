/**
 *
 * @author Mudassar
 */

import java.util.Scanner;

public class LeftPyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Number of rows you want");
        n=sc.nextInt();
        for(int i=1;i<=n;i++) {
            for(int k=n-i;k>0;k--)
            {
                System.out.print("-");
            }
            for (int j = 0; j<i; j++) {

                System.out.print("*");
            }
            System.out.println();
        }
    }
}