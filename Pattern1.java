/**
 *
 * @author Mudassar
 */

import java.util.Scanner;

public class Patter1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Number of rows you want");
        n=sc.nextInt();
        for(int j=1;j<=n;j++) {
            for(int k=(n-j);k>0;k--)
            {
                System.out.print(" ");
            }
            for (int i = 0; i<j; i++) {

                System.out.print("* ");
            }
            System.out.println();
        }
    }
}