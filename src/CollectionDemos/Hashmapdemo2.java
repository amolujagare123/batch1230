package CollectionDemos;

import java.util.HashMap;

public class Hashmapdemo2 {
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

      //  System.out.println(hm.containsKey(34));

      //  System.out.println(hm.containsValue("gaurav3323"));


        HashMap hm1 = new HashMap();

        System.out.println("hm1="+hm1);

        hm1.putAll(hm);

        System.out.println("updated hm1="+hm1);



    }
}
