package CollectionDemos;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class HasMapDemo3 {

    public static void main(String[] args) {

        HashMap hm = new HashMap<>();
        hm.put(101, "deepak");
        hm.put(344, "ashish");
        hm.put(123, "abhishek");
        hm.put(676, "amol");
        hm.put(343, "manisha");
        hm.put(877, "dharani");
        hm.put(122, "gaurav");
        System.out.println("hm="+hm);
/*

          Set set = hm.keySet();
        System.out.println(set);

         Collection c =  hm.values();
        System.out.println(c);

         Set entrySet =   hm.entrySet();

        System.out.println(entrySet);
*/


    }
}
