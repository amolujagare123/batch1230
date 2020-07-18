public class DecrementDemo {
    public static void main(String[] args) {
        int i=10;

        System.out.println(i);  // 10
        System.out.println(i--); // first the statement is executed then decrement happens  // 10
        System.out.println(i); // 9
        System.out.println(--i); //first decrement happens and then the statements executes // 8
        System.out.println(i); // 8

        // 10 , 10 , 9 , 8 , 8
    }
}
