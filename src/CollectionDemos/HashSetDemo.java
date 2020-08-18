package CollectionDemos;

import java.util.HashSet;

public class HashSetDemo {

    public static void main(String[] args) {


        HashSet hs = new HashSet();
        hs.add("abhishek");
        hs.add("Amol");
        hs.add("deepak");
        hs.add("dharani");
        hs.add("manisha");


        System.out.println(hs);

        System.out.println(hs.add("manisha"));

        System.out.println(hs);

        hs.add(12);
        hs.add('j');
        hs.add(34.67);

        System.out.println(hs);



    }
}
