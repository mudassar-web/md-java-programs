/**
 *
 * @author Mudassar
 */

import java.util.Scanner;

public class Stringfunctions {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=new String("cat");
        String s2=new String("rat");
        int value=s1.compareTo(s2);
        System.out.println(value);
        if(value>0)
        {
            System.out.println("s1 is greater than s2");
        }
        else if(value<0)
        {
            System.out.println("s2 is greater than s1");
        }
        else
        {
            System.out.println("Both strings are equal");
        }
        String name;
        System.out.println("Enter string");
        name=sc.next();
        int length=name.length();
        System.out.println("Length="+length);
        System.out.println(name.indexOf('a'));
        System.out.println(name.lastIndexOf('a'));
        System.out.println("Character:"+name.charAt(0));
        System.out.println(add.concat(name));
        System.out.println(name.substring(0,3));
        System.out.println(name.equals(add));
        System.out.println(name.equalsIgnoreCase(name1));
        System.out.println(name.compareTo(name1));        
    }
}