package ClassAndConstructors;

public class MyClass {
    int a; // 4 byte
    double d; // 8 byte
    char c; // 1 byte
    String str; // 1 byte string

    void display()
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    MyClass() // contructor overloading
    {

    }

    MyClass(char c1)
    {
        a =34;
        d=1.2;
        System.out.println(c1);
    }

    public static void main(String[] args) {

        MyClass ob = new MyClass(); // object is an intance of a class
        ob.a =10;
        ob.d=12.45;
        ob.c='g';
        ob.str="anil";
        ob.display();

        MyClass ob1 = new MyClass();

        ob1.a = 34;
        ob1.d =34.56;
        ob1.c= 'c';
        ob1.str="manisha";

        ob1.display();




    }


}
