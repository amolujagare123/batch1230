package CollectionDemos;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo2 {

    public static void main(String[] args) {


        Vector<Integer> v = new Vector();
        v.add(34);
        v.add(14);
        v.add(24);
        v.add(41);
        v.add(4);
        v.add(4);

        System.out.println(v);
       /* v.clear();
        System.out.println(v);*/

        v.remove(new Integer(24));

        System.out.println(v);

        v.remove(3);
        System.out.println(v);

        v.set(1,50);
        System.out.println(v);

        System.out.println(v.get(1));


        Iterator itr = v.iterator();

        System.out.println("--- using  iterator ----");
        while (itr.hasNext())
            System.out.println(itr.next());

        System.out.println("--- using  Enumerator ----");

        Enumeration e = v.elements();
        while(e.hasMoreElements())
            System.out.println(e.nextElement());



          Object[] vArray =   v.toArray();
        System.out.println("--- using  Array ----");
          for(int i=0;i<vArray.length;i++)
              System.out.println(vArray[i]);

        System.out.println("--- using  For each loop ----");
        for(Object value : vArray)
            System.out.println(value);




    }

}
