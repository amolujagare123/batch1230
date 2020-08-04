package AbstractionDemo;

public abstract class MyAbstractClass {

    abstract void start();
    abstract void run();

    void display()
    {
        System.out.println("display");
    }
}

class ChildAbstract extends MyAbstractClass
{
    void start()
    {
        System.out.println("start");
    }
   void run()
    {
        System.out.println("run");
    }

    public static void main(String[] args) {

        MyAbstractClass ob = new ChildAbstract();

        ob.start();
        ob.display();
        ob.run();


    }

}