package InheritancePolymorphism;

public class TVShowroom {

    void channels()
    {
        System.out.println("Change channels");
    }
    void volume()
    {
        System.out.println("Change volume");
    }
    void settings()
    {
        System.out.println("Change settings");
    }

}

class Samsang extends  TVShowroom
{
    void channels()
    {
        System.out.println("Samsang:Change channels");
    }
    void volume()
    {
        System.out.println("Samsang:Change volume");
    }
    void settings()
    {
        System.out.println("Samsang:Change settings");
    }
}

class LG extends  TVShowroom
{
    void channels()
    {
        System.out.println("LG: Change channels");
    }
    void volume()
    {
        System.out.println("LG: Change volume");
    }
    void settings()
    {
        System.out.println("LG: Change settings");
    }
}

class Onida extends TVShowroom
{
    void channels()
    {
        System.out.println("Onida:Change channels");
    }
    void volume()
    {
        System.out.println("Onida:Change volume");
    }
    void settings()
    {
        System.out.println("Onida:Change settings");
    }

}


class TestOverriding
{
    /*In this process, an overridden method
     is called through the reference variable of a superclass*/

    public static void main(String[] args) {
        TVShowroom tv = new Samsang(); // upcasting
        // if you wan to call an overridden method the you have to
        // created the referece variable of the parent

        tv.channels();
        tv.settings();
        tv.volume();

        tv = new LG();

        tv.channels();
        tv.settings();
        tv.volume();

        tv = new Onida();
        tv.channels();
        tv.settings();
        tv.volume();
    }
}

