package AbstractionDemo;

public interface MyInterface1 {
    void display();
    void call();
}

interface AnotherInterface
{
    void display();
}

class ChildMultipleParents implements MyInterface1,AnotherInterface
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
        AnotherInterface ob = new ChildMultipleParents();

        ob.display();
    }
}
