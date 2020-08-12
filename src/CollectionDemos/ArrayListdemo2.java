package CollectionDemos;

import java.util.ArrayList;

public class ArrayListdemo2 {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList();

        al.add("abc1");
        al.add("abc2");
        al.add("abc3");
        al.add("abc4");

         System.out.println(al);
        System.out.println(al.size());


        System.out.println(al.get(3));

       /* for(int i=0 ;i<al.size();i++)
        {
            System.out.println(al.get(i));
        }*/

        al.set(2,"amol");
        System.out.println(al);

        al.remove("abc1");
        System.out.println(al);

       /* al.clear();

        System.out.println(al);
        System.out.println(al.size());*/
    }
}
