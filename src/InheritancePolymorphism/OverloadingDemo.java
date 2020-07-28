package InheritancePolymorphism;

public class OverloadingDemo {

    int a;
    int b;
    int sum;


    void addition() // method over loading
    {
        sum = a+b;
        System.out.println(sum);
    }

    void addition(int c)
    {
        sum = a+b+c;
        System.out.println(sum);
    }

    public static void main(String[] args) {
        OverloadingDemo ob = new OverloadingDemo();
        ob.a = 90;
        ob.b = 12;

        ob.addition();

        ob.addition(8);

    }

}
