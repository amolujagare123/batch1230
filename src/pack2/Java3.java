package pack2;

import pack1.Java1;

public class Java3 {
  public int a3;
    public double d3;
     protected char c3;
    String str3;

    void display3()
    {
        System.out.println("a="+a3);
        System.out.println("d="+d3);
        System.out.println("c="+c3);
        System.out.println("str="+str3);
    }

    public static void main(String[] args) {
        Java1 ob = new Java1();
        ob.a1 =90;
      //  ob.c1 = 'b';
    }
}
