/**
 *
 * @author Mudassar
 */

public class Inheritence_B extends Inheritence_A {
    int sub1,sub2;
    void setSubject(int s,int s1)
    {
        sub1=s;
        sub2=s1;
    }
    void showSub()
    {
        System.out.println("Sub:"+sub1+" "+"sub2:"+sub2);
    }
}