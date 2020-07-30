package finalandstatic;

public final class FinalMethodDemo {

    final void display() // final methods can not be overriden
    {
        System.out.println("display");
    }

}

class ChildFinal //extends FinalMethodDemo
{

   /* void display() // overriden method
    {
        System.out.println("display");
    }*/

}
