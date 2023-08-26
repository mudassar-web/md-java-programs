/**
 *
 * @author Mudassar
 */

public class Inheritence_C extends Inheritence_B {
    int total;
    float percent;
    void showResult()
    {
        display();
        showSub();
        total=sub1+sub2;
        percent=(float)total/2;
        System.out.println("Total:"+total+" "+"percent:"+percent);
    }
}