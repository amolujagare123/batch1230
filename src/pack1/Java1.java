package pack1;

import finalandstatic.StaticExample;
import finalandstatic.StaticMethod;
import pack2.Java3;

import static finalandstatic.StaticExample.*;
import static finalandstatic.StaticMethod.getUrl;

public class Java1 extends Java3 {
   public int a1;
    double d1;
    private char c1;
    String str1;

    void display1()
    {
        System.out.println("a="+a1);
        System.out.println("d="+d1);
        System.out.println("c="+c1);
        System.out.println("str="+str1);
    }

    public static void main(String[] args) {

        /* Java1 ob = new Java1();
         ob.a1 =12;
         ob.d1 =12.3;
         ob.c1 = 'b';

         ob.a3 = 90 ;
         ob.d3 = 23.45;
         ob.c3 ='j';

         ob.display1();*/

        System.out.println(college);


        System.out.println(getUrl());

        System.out.println(getUrl());

    }
}
