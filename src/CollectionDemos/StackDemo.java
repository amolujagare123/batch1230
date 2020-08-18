package CollectionDemos;

import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {

        Stack s = new Stack<>();
        System.out.println(s.empty());

        s.push("amol");
        s.push("manisha");
        s.push("gaurav");
        s.push("deepak");
        s.push("dharani");
        s.push("praful");

        System.out.println(s);

        System.out.println(s.pop());

        System.out.println(s);

        System.out.println(s.pop());

        System.out.println(s);

        System.out.println(s.peek());
        System.out.println(s);

        System.out.println(s.empty());



    }
}
