package CollectionDemos;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListPrintDemo {

    public static void main(String[] args) {


        ArrayList<String> al = new ArrayList();

        al.add("abc1");
        al.add("abc2");
        al.add("abc3");
        al.add("abc4");

        System.out.println(al);

        System.out.println("Using for loop");

        for(int i =0;i<al.size();i++)
        {
            System.out.println(al.get(i));
        }

        System.out.println("Using Iterator");

        Iterator itr = al.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());

        System.out.println("Using for each loop");
        for(String str:al)
        {
            System.out.println(str);

        }

        al.clear();

        System.out.println(al);


    }
}
