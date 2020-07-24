package pack1;

public class BaseClass {

    int a;
    int b;

}

class DerivedClass extends BaseClass
{

    int c;

    public static void main(String[] args) {
        DerivedClass ob = new DerivedClass();
        ob.c =10;
        ob.a =78;
    }

}
