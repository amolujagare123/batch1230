package CollectionDemos;

import java.util.LinkedList;

public class LinkedListdemo {

    public static void main(String[] args) {

        LinkedList<String> ll = new LinkedList();
        ll.add("abc1");
        ll.add("abc2");
        ll.add("pqr1");
        ll.add("pqr2");

        System.out.println(ll);

        ll.addFirst("First");
        ll.addLast("Last");

        System.out.println(ll);

        ll.removeFirst();
        ll.removeLast();

        System.out.println(ll);

    }
}
