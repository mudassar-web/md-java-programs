/**
 *
 * @author Mudassar
 */

/*
11. Implement a program to accomplish the following task using String/StringBuffer class:
i. Accept a password from user.
ii. Check if password is correct, then display Good else display Incorrect Password
iii. Append the password with the string Welcome to Java!!!
iv. Display the password in reverse order
*/

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args)
    {
        String s;
        StringBuffer sb;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter password:");
        s=sc.nextLine();    
        sb=new StringBuffer(s);
        if (sb.equals("supersecert"))
        {
            System.out.println("Good");
            sb.append("Welcome to java!!!");
            System.out.println(sb);
            sb.reverse();
            System.out.println(sb);
            sb.replace(0,10,"***");
            sb.reverse();
            System.out.println(sb);
        }
        else
        {
            System.out.println("Incorrect password");
        }
    }
}