/**
 *
 * @author Mudassar
 */

import java.util.Vector;

public class VectorCmd {
    public static void main(String[] args) {
        Vector v=new Vector();
        v.add(args[0]);
        v.add(args[1]);
        v.add(args[2]);
        v.add(args[3]);
        v.add(args[4]);
        System.out.println(v);
    }
}