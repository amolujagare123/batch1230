package InheritancePolymorphism;

public class Animal {

   void eat()
   {
       System.out.println("Animal eat");
   }

}

class Dog extends Animal
{
    void bark()
    {
        System.out.println("Dog barks");
    }

}

class BabyDog extends Dog
{
    void weep()
    {
        System.out.println("Baby dog weeps");
    }
}


class  TestMultipleInheritance
{
    public static void main(String[] args) {


        BabyDog ob = new BabyDog();
        ob.weep();
        ob.bark();
        ob.eat();

        Dog ob1 = new Dog();

        ob1.bark();
        ob1.eat();


    }
}
