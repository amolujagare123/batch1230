package MethodsArgumentsAndreturningvalues;

import pack2.java4;

public class ReturnDemo {

    int addition()
    {
        int a =10;
        int b =20;
        int c =a+b;
        return  c;
    }


    float getMyfloatvalue()
    {
        return  12.3f;
    }


    int getMyInt(int i)
    {
        return i;
    }

     String getMyString(String str)
     {
         return  str;
     }

     int[] getMyArray()
     {
         int[] a = {67,5,32,12,12,5,8,3,12,69,21};

         return  a;
     }

     String[][] getMy2dStringArray()
     {
         String[][] strArr = { {"str1","abc1"} ,{"str2","abc2"} ,{"str3","abc3"}  };

         return strArr;
     }


    java4 getMyObject()
    {
        java4 obj = new java4();
        obj.a4 = 67;
        obj.d4 =34.67;
        obj.str4 ="assa";
        obj.c4='i';

        return obj;
    }



    public static void main(String[] args) {

        ReturnDemo ob = new ReturnDemo();

        int x = ob.addition();
        System.out.println(x);
        System.out.println(ob.addition());

        float f = ob.getMyfloatvalue();
        System.out.println(f);
        System.out.println(ob.getMyfloatvalue());



        int[] b = ob.getMyArray();

        for(int i=0;i<b.length;i++)
            System.out.print(b[i]+" ");


        String[][] st1 = ob.getMy2dStringArray();

        System.out.println();

        for(int i =0; i<st1.length;i++)
        {
            for(int j=0;j<st1[0].length;j++)
            {
                System.out.print(st1[i][j]+" ");
            }

            System.out.println();
        }



        java4 obj4 = new java4();

         obj4 =  ob.getMyObject();

        obj4.display4();


    }


}
