/**
 *
 * @author Mudassar
 */

interface Mobile
{
    public void call();
    public void sms();
    public void mms();
}
interface Google
{
    public void setAccount();
}
class Nokia implements Mobile
{
     public void call()
     {
         System.out.println("Nokia supports Outgoing and Incoming calls through carrier");
     }
     public void sms()
     {
         System.out.println("Nokia supports SMS through carrier");
     }
     public void mms()
     {
         System.out.println("Nokia does not supports");
     }
}

class Samsung implements Mobile,Google
{
    public void call()
    {
        System.out.println("Samsung supports Outgoing and Incoming calls through carrier,GPRS and 4G");
    }
    public void sms()
    {
        System.out.println("Samsung supports SMS through carrier,GPRS and 4G");
    }
    public void mms()
    {
        System.out.println("Samsung supports MMS calls through carrier,GPRS and 4G");
    }
    public void setAccount()
    {
        System.out.println("Samsung supports Google Accounts");
    }
}

public class MobileEx
{
    public static void main(String args[])
    {
        Nokia n=new Nokia();
        n.call();
        n.sms();
        n.mms();
        
        Samsung s=new Samsung();
        s.call();
        s.sms();
        s.mms();
        s.setAccount();
    }
}