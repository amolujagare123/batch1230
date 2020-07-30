package MethodsArgumentsAndreturningvalues;

public class ArgumentDemo1 {

    String name;
    String city;

    void  display()
    {
        System.out.println("display");
        int a=10;
    }

    void displayObject(ArgumentDemo1 obj)
    {
        System.out.println(obj.name);
        System.out.println(obj.city);
    }

    void mymethod(int a, int b) {
        System.out.println("a=" + a);
        System.out.println("b=" + b);

    }

    void getMyString(String str) {
        System.out.println(str);
    }

    void getMydouble(double d)
    {
        System.out.println(d);
    }

    void getMyArray(int[] a)
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }

    }

    public static void main(String[] args) {
        ArgumentDemo1 ob = new ArgumentDemo1();
        ob.mymethod(23,56);
        ob.getMyString("amol");
        ob.getMydouble(34.7);

        int[] b = {45,21,65,12,56,123,212,3};

        ob.getMyArray(b);
        ob.name="gaurav";
        ob.city="pune";

        ob.displayObject(ob);


       // System.out.println(ob.display());

    }

}
