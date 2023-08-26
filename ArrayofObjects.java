import java.util.Scanner;

public class ArrayofObjects {
    int empid,salary;
    String name;
    void getdata(int empid,int salary,String name)
    {
       this.empid=empid;
       this.salary=salary;
       this.name=name;
    }
    void display()
    {
        System.out.println("Empid:"+empid+" salary:"+salary+"Name:"+name);

    }
    public static void main(String[] args) {
        int empid,salary;
        String name;
        ArrayofObjects[] a=new ArrayofObjects[2];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<a.length;i++)
        {
           a[i]=new ArrayofObjects();
           System.out.println("Enter id salary name of employee");       
           empid=sc.nextInt();
           salary=sc.nextInt();
           name=sc.next();
           a[i].getdata(empid,salary,name);
        }
        for (int i=0;i<a.length;i++)
        {
            a[i].display();
        }
    }
}