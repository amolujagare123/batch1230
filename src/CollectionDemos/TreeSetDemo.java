package CollectionDemos;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {

        TreeSet treeSet = new TreeSet();

        treeSet.add("abhishek");
        treeSet.add("deepak");
        treeSet.add("Amol");
        treeSet.add("manisha");
        treeSet.add("dharani");

        //treeSet.add(12);


        System.out.println(treeSet);
        treeSet.add("dharani");

        System.out.println(treeSet);


        Iterator itr = treeSet.iterator();

        while (itr.hasNext())
            System.out.println(itr.next());




    }

}
