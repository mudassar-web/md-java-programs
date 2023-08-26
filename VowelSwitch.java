/**
 *
 * @author Mudassar
 */

public class VowelSwitch {
    public static void main(String arg[])
    {
        char c='i';
        boolean is_vowel=false;
        switch(c)
        {
            case 'a':;
            case 'e':;
            case 'i':;
            case 'o':;
            case 'u':;
            is_vowel=true;                
        }
        if(is_vowel)
        {
            System.out.println(c+" is vowel");
        }
        else
        {
            System.out.println(c+" is consonent");
        }            
    }    
}