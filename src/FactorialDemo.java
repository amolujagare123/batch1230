public class FactorialDemo {

    public static void main(String[] args) {

        int n=6;
        int multiply = 1;

        for(int i=n; i>=1 ;i--) // i = 5,4,3,2,1
        {

            multiply = multiply * i;

        }

        System.out.println("Factorial:"+multiply);

    }
}
