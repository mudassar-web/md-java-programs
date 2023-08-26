/**
 *
 * @author Mudassar
 */

public class Interface_Customer implements Interface_Account, Interface_Person {
    String name, addr;
    int n,acc, bal;

    public void set(int accno) {
        acc = accno;
    }

    public void store(String n, String add) {
        name=n;
        addr=add;
    }
    public void intrest()
    {
        float inter=(rate*bal*n)/100;
        System.out.println("Intrest:"+inter);
    }
    Interface_Customer(int num,int b)
    {
        n=num;
        bal=b;
    }

    public void display() {
        System.out.println("Account No:" + acc);
        System.out.println("Balance:" + bal);
    }

    public void disp() {
        System.out.println("Name:"+name);
        System.out.println("Address:"+addr);
    }
}