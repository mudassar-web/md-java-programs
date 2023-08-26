/**
 *
 * @author Mudassar
 */

public class Count {
    public static void main(String args[]){
        String s=new String("I Love Java Programming @version 1.8");
        int i;
        char ch;
        int count=0;
        int count1=0;
        int count2=0;
        int count3=0;


        int length=s.length();
        //System.out.println(length);
        for(i=0;i<length;i++)
        {
            ch=s.charAt(i);
            if(Character.isLetter(ch))
            {
                count++;
            }
            else if (Character.isDigit(ch))
            {
                count1++;
            }
            else if(Character.isWhitespace(ch))
            {
                count2++;

            }
            else if(!Character.isLetterOrDigit(ch))
            {
                count3++;
            }

        }
        System.out.println("Letters:"+count);
        System.out.println("Digits:"+count1);
        System.out.println("Words:"+count2);
        System.out.println("Special Symbols:"+count3+1);
    }
}