package InheritancePolymorphism;

public class Animal1 {
    void eat()
    {
        System.out.println("Animal eat");
    }
}

class Dog1 extends Animal1
{
    void bark()
    {
        System.out.println("Dog Barks");
    }
}

class Cat extends Animal1
{
    void meow()
    {
        System.out.println("Cat meows");
    }

}

class TestHierarchicalInheritance
{
    public static void main(String[] args) {

        Cat ob = new Cat();
        ob.meow();
        ob.eat();

        Dog d = new Dog();
        d.bark();
        d.eat();


    }
}