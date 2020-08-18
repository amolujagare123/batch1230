package CollectionDemos;

import java.util.HashMap;

public class HashMapDemo {

    public static void main(String[] args) {


        HashMap hm = new HashMap<>();

        System.out.println(hm.isEmpty());
        System.out.println(hm.size());


        hm.put(101,"deepak");
        hm.put(344,"ashish");
        hm.put(123,"abhishek");
        hm.put(676,"amol");
        hm.put(343,"manisha");
        hm.put(877,"dharani");
        hm.put(122,"gaurav");

        System.out.println(hm);

        hm.put(122,"gaurav123");

        System.out.println(hm);

        hm.put(817,"dharani");
        System.out.println(hm);


        hm.put(111,null);
        hm.put(112,null);
        hm.put(113,null);



        hm.put(null,"This is null");
        hm.put(null,"This is new null");

        System.out.println(hm);
       /* hm.put('c',111);
        hm.put("amol",6);
        hm.put(12.2,"gaurav");

        System.out.println(hm);*/


        System.out.println(hm.isEmpty());

        System.out.println(hm.size());

        System.out.println(hm.get(676));
        hm.remove(676);


        //hm.clear();
        System.out.println(hm);
    }

}
