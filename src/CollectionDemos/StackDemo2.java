package CollectionDemos;

import java.util.Stack;

public class StackDemo2 {

    public static void main(String[] args) {
        Stack s = new Stack<>();

        s.push("amol");
        s.push("manisha");
        s.push("gaurav");
        s.push("deepak");
        s.push("dharani");
        s.push("praful");

        System.out.println(s.search("fjkdjkd"));
        System.out.println(s.search("gaurav"));

    }
}
