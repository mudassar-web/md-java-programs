/**
 *
 * @author Mudassar
 */

import java.util.Scanner;

public class ArrayGreatestof3 {
    public static void main(String[] args) {
        int a[]=new int[3];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three numbers:");
        for(int i=0;i<=2;i++)
        {
            a[i]=sc.nextInt();
        }
        if (a[0]>a[1] && a[0]>a[2])
        {
            System.out.println(a[0]+"is greatest");
        }
        else if (a[1]>a[0] && a[1]>a[2])
        {
            System.out.println(a[1]+"is greatest");
        }
        else {
            System.out.println(a[2]+"is greatest");
        }
    }
}