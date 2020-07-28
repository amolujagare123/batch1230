package InheritancePolymorphism;

public class OverridingDemo {


    void display()
    {
        System.out.println("OverridingDemo");
    }


}

class  ChildOverriding extends OverridingDemo
{
    void display()
    {
        System.out.println("ChildOverriding");
    }



}
