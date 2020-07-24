package ClassAndConstructors;

public class MyClass2 {

    int a;
    double d;
    char c;
    String str;




    MyClass2()  // normal constructor
    {
        a= 45;
        d = 12.3;
        c = 'g';
        str = "abcd";
    }

    void display()
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {
        MyClass2 ob = new MyClass2(); // object is an intance of a class
        /*ob.a = 10;
        ob.d = 12.45;
        ob.c = 'g';
        ob.str = "anil";*/
           ob.display();
    }
}
