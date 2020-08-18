package CollectionDemos;

import java.util.PriorityQueue;

public class PriorityqueDemo {
    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        /*pq.offer(12);
        pq.offer(232);
        pq.offer(312);
        pq.offer(121);
        pq.offer(23);*/

        System.out.println(pq);
// que - first in first out
//  [12, 23, 121, 232, 312 ]
       // some compiler on dont support priority que so
        // you may not see the printed output in the proper sorted order

        System.out.println(pq.peek());

        System.out.println(pq);




      /*  System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());*/


    }

}
