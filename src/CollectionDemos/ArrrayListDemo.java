package CollectionDemos;

import java.util.ArrayList;

public class ArrrayListDemo {

    public static void main(String[] args) {

        ArrayList al = new ArrayList();

        al.add("abc1");
        al.add("abc2");
        al.add("abc3");
        al.add("abc4");

        System.out.println(al);
        System.out.println(al.size());

        al.add("abc5");
        al.add(12);
        al.add('g');
        al.add(34.6);

        System.out.println(al);
        System.out.println(al.size());


        al.remove("abc2");

        System.out.println(al);
        System.out.println(al.size());


    }

}
