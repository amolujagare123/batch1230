package pack1;

public class Java1 {
    public int a1;
    protected double d1;
    private char c1;
    protected String str1;


    void display1()
    {
        System.out.println("a="+a1);
        System.out.println("d="+d1);
        System.out.println("c="+c1);
        System.out.println("str="+str1);
    }

    public static void main(String[] args) {

        Java1 ob = new Java1();

        ob.a1 = 10;
        ob.d1 = 9.4;
        ob.c1='v';

    }

}

class Abc
{
    public static void main(String[] args) {
        Java1 ob = new Java1();
       // ob.c1 ='g' ;
    }
}
