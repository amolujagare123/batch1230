public class IncrementDecrement {

    public static void main(String[] args) {

        int i=10;

        System.out.println(i);  // 10 - correct
        System.out.println(i++); // first the statement is executed then increment happens  // 10
        System.out.println(i); // 11
        System.out.println(++i); //first increment happens and then the statements executes // 12
        System.out.println(i); // 12

        // 10 , 10 ,11 ,12, 12
    }

}
