package CollectionDemos;

import java.util.ArrayDeque;

public class ArrayDequeueDemo {

    public static void main(String[] args) {


        ArrayDeque<Integer> adq = new ArrayDeque<>();

        adq.offer(172);
        adq.offer(342);
        adq.offer(121);
        adq.offer(112);
        adq.offer(102);

        System.out.println(adq);

         adq.offerFirst(0);
         adq.offerLast(999);

        System.out.println(adq);

        adq.pollFirst();
        adq.pollLast();

        System.out.println(adq);








    }
}
