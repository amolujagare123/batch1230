package finalandstatic;

public class StaticExample {

    int rno;
    String name;
    public  static String college="ITS";

    public static void main(String[] args) {
        StaticExample ob = new StaticExample();

        ob.rno =1;
        ob.name="amol";
        ob.college="PICT";

        System.out.println(ob.rno);
        System.out.println(ob.name);
        System.out.println(ob.college); // --> ???

        StaticExample ob1 = new StaticExample();

        System.out.println(ob1.rno);
        System.out.println(ob1.name);
        System.out.println(ob1.college); // --- ???

        System.out.println("Collge variable accessed with classname");
        System.out.println(StaticExample.college);

        StaticExample.college ="COEP";

        System.out.println(ob.college);
        System.out.println(ob1.college);


        System.out.println(college);
       // System.out.println(rno);








    }
}
