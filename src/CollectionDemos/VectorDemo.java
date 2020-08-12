package CollectionDemos;

import java.util.Vector;

public class VectorDemo {

    public static void main(String[] args) {

        Vector<Integer> v = new Vector(5,3); // default initial capacity 10
        System.out.println("Size:"+v.size());
        System.out.println("capacity:"+v.capacity());

        v.add(34);
        v.add(14);
        v.add(24);
        v.add(41);
        v.add(4);
        v.add(4);


        System.out.println(v);

        System.out.println("Size:"+v.size());
        System.out.println("capacity:"+v.capacity());
    }
}
