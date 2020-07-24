package ClassAndConstructors;

public class ParameterizedConstructor {


    int a;
    double d;
    char c;
    String str;

    ParameterizedConstructor(int x, double d1, char cc , String ss)
    {
        a= x;
        d = d1;
        c = cc;
        str = ss;
    }



    void display()
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {

        ParameterizedConstructor ob = new ParameterizedConstructor(12,45.6,'g',"xyz");

        ob.display();
    }
}
