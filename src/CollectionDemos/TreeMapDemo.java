package CollectionDemos;

import java.util.TreeMap;

public class TreeMapDemo {

    public static void main(String[] args) {

        TreeMap tm = new TreeMap();
        tm.put(101, "deepak");
        tm.put(344, "ashish");
        tm.put(123, "abhishek");
        tm.put(676, "amol");
        tm.put(343, "manisha");
        tm.put(877, "dharani");
        tm.put(122, "gaurav");
        System.out.println("hm="+tm);

        TreeMap tm1 = new TreeMap();

        tm1.put("abhishek",203);
        tm1.put("manisha",203);
        tm1.put("gaurav",203);
        tm1.put("dharani",203);
        tm1.put("deepak",203);
        tm1.put(12,434);

        System.out.println(tm1);

    }
}
