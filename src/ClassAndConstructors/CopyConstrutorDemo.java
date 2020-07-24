package ClassAndConstructors;

public class CopyConstrutorDemo {

    int a;
    double d;
    char c;
    String str;

    CopyConstrutorDemo()
    {

    }

    CopyConstrutorDemo(CopyConstrutorDemo obj)
    {
        a = obj.a;
        d= obj.d;
        c = obj.c;
        str = obj.str;
    }

    void display()
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }


    public static void main(String[] args) {

        CopyConstrutorDemo ob = new CopyConstrutorDemo();
        ob.a =12;
        ob.d= 12.45;
        ob.c='g';
        ob.str="Amol";
        ob.display();

         CopyConstrutorDemo ob1 = new CopyConstrutorDemo(ob);
         ob1.display();



    }




}
