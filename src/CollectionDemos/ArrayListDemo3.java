package CollectionDemos;

import java.util.ArrayList;

public class ArrayListDemo3 {
    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList();

        al.add("abc1");
        al.add("abc2");
        al.add("abc3");
        al.add("abc4");

        System.out.println(al);
        System.out.println(al.size());


        ArrayList<String> al2 = new ArrayList();

        al2.add("abc1");
        al2.add("abc2");
        al2.add("pqr1");
        al2.add("pqr2");

        System.out.println(al2);
        System.out.println(al2.size());


       /* al.addAll(al2);

        System.out.println(al);*/

        al.removeAll(al2);
        System.out.println(al);

    }

}
