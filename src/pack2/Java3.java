package pack2;

import pack1.Java1;

public class Java3 extends  Java1{

    int a3;
    double d3;
    char c3;
    String str3;


    void display3()
    {
        System.out.println("a="+a3);
        System.out.println("d="+d3);
        System.out.println("c="+c3);
        System.out.println("str="+str3);
    }

    public static void main(String[] args) {
       /* Java1 ob = new Java1();
        ob.a1 = 90;
        ob.d1 = 23.6;*/

        Java3 ob1 = new Java3();

        ob1.a1 = 34;
        ob1.d1 =90.4;
        ob1.str1 ="ssds";

    }
}
