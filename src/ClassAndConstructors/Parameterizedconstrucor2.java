package ClassAndConstructors;

public class Parameterizedconstrucor2 {

    int a;
    double d;
    char c;
    String str;

    Parameterizedconstrucor2(int a, double d, char c , String str)
    {
        this.a= a;
        this.d = d;
        this.c = c;
        this.str = str;
    }



    void display()
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {

        Parameterizedconstrucor2 ob = new Parameterizedconstrucor2(12,45.6,'g',"xyz");

        ob.display();
    }
}
