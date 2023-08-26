/**
 *
 * @author Mudassar
 */


import java.util.*;

public class DoubleStairs
{
    public static void main(String arg[])
    {
        int n,i,j,k,g;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            k=i;
            for(g=n;g>k;g--)
                System.out.print(" ");
            for(j=0;j<k;j++)
                System.out.print("* ");
            System.out.println();
            k++;
        }
    }
}