package ClassAndConstructors;

public class CpyConstructorDemo {

    int a;
    double d;
    char c;
    String str;

    void display()
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    CpyConstructorDemo()
    {

    }


    CpyConstructorDemo(CpyConstructorDemo obj)
    {
        a = obj.a;
        d = obj.d;
        c= obj.c;
        str = obj.str;

    }

    public static void main(String[] args) {

        CpyConstructorDemo ob = new CpyConstructorDemo();

        ob.a =12;
        ob.d =12.3;
        ob.c = 'n';
        ob.str = "xyz";

        ob.display();

        CpyConstructorDemo ob1 = new CpyConstructorDemo(ob);
        ob1.display();
    }
}
