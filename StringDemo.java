/**
 *
 * @author Mudassar
 */

public class StringDemo
{
    public static void main(String arg[])
    {
        char a[]={'m','i','r','a'};
        String s=null;
        String s1=new String(a);
        String s2="Hello";
        String s3="Mudassar Ansari";
        System.out.println("s="+s);
        System.out.println("s1="+s1);
        System.out.println("s2="+s2);
        System.out.println("s3="+s3);
        s=s2+s3;
        System.out.println("new s="+s);
        s3="Hussain";
        System.out.println("new s3="+s3);
        String city[]={"mumbai","delhi","pune"};
        System.out.println("Array length="+city.length);
        System.out.println("Length function="+s.length());
        System.out.println("index of 'l'="+s2.indexOf('l'));
        System.out.println("index of next 'l'="+s2.indexOf('l',s2.indexOf('l')+1));
        System.out.println("last index of 'a' in "+s3+"="+s3.lastIndexOf('a'));
    }
}