package InheritancePolymorphism;

public class ParentClass {

    int a;
    int b;

    void display()
    {
        System.out.println("a="+a);
        System.out.println("b="+b);
    }

}

class ChildClass extends  ParentClass
{
    int c;

    void childMethod()
    {
        System.out.println("in side child method");
    }

    public static void main(String[] args) {

        ChildClass ob = new ChildClass();

        ob.c= 12;
        ob.childMethod();

        ob.a = 90;
        ob.display();

    }


}