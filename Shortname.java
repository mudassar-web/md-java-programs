/**
 *
 * @author Mudassar
 */

import java.util.Scanner;

public class Shortname {
    public static void main(String args[])
    {
        String name;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name:");
        name=sc.next();
        int length=name.length();
        char ch[]=new char[10];
        char ch1=name.charAt(0);
        int i;
        int j=0;
        int count=0;
        for(i=1;i<length;i++)
        {
            ch1=name.charAt(i);
            if(Character.isWhitespace(ch1))
            {
                count++;
                ch[j]=name.charAt(i+1);
            }
            String name1=String.valueOf(ch1)+"."+String.valueOf(ch[0]);
        }
        System.out.println("Name in short form : "+name1);
    }
}