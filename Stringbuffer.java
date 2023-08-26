/**
 *
 * @author Mudassar
 */

public class Stringbuffer {
    public static void main(String args[])
    {
        StringBuffer sb=new StringBuffer("Hello world");
        System.out.println("Original word:"+sb);
        sb.replace(0,5,"Hi");
        System.out.println("Modified word:"+sb);
        sb.delete(0,8);
        System.out.println(sb);
        sb.delete(0,sb.length());
        System.out.println(sb);
        StringBuffer sb1=new StringBuffer("Abutalha");
        System.out.println(sb1);
        sb1.deleteCharAt(0);
        System.out.println(sb1);
    }
}