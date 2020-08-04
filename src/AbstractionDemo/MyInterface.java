package AbstractionDemo;

public interface MyInterface {

    void display();
    void call();

    default void myMethod()
    {
        System.out.println("My method");
    }
    static void myPublicMethod()
    {
        System.out.println("This is a public method");
    }
}
class  ChildOfInterface implements  MyInterface
{
    public void display()
    {
        System.out.println("display");
    }

    public void call()
    {
        System.out.println("call");
    }

    public static void main(String[] args) {
        MyInterface ob = new ChildOfInterface();
        ob.display();
        ob.call();
        ob.myMethod();
        // ob.myPublicMethod();
        // you cant call the static methods inside the interface
        // using the object refernce
        // to call static methods just use interface name
        MyInterface.myPublicMethod();
    }
}
