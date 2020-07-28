package InheritancePolymorphism;

public class OverloadingDemo2 {


    void display(int a)
    {
        System.out.println(a);
    }

    void display(double d)
    {
        System.out.println(d);
    }

    void display(String str)
    {
        System.out.println(str);
    }

    void display(int[] a)
    {
        for (int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
    }

    public static void main(String[] args) {

        OverloadingDemo2 ob = new OverloadingDemo2();

                ob.display(6);
                
                ob.display("amol");

                int[] b = {23,45,12,6,7,34};

                ob.display(b);
    }


}
