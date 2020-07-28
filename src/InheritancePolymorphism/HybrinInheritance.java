package InheritancePolymorphism;

public class HybrinInheritance {

    public static void main(String[] args) {

        Dog2  d = new Dog2();
        d.Dog2Method();
        d.eat();
        d.MamalMethod();

        Mammal m = new Mammal();
        m.MamalMethod();
        m.eat();

        Reptile r = new Reptile();

        r.ReptileMethod();
        r.eat();


    }
}


class Animal2

{
void eat()
{
    System.out.println("eat");
}

}
 class Mammal extends Animal2

{
    void MamalMethod()
    {
        System.out.println("MamalMethod");
    }
}

class Reptile extends Animal2

{
    void ReptileMethod()
    {
        System.out.println("ReptileMethod");
    }
}

class Dog2 extends Mammal

{
    void Dog2Method()
    {
        System.out.println("Dog2Method");
    }

}