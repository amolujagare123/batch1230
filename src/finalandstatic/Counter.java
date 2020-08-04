package finalandstatic;

public class Counter {

    static int count =0;

    Counter()
    {
        count++;
        System.out.println(count);
    }

    public static void main(String[] args) {
        Counter ob1 = new Counter();//
        Counter ob2 = new Counter();//
        Counter ob3 = new Counter();//
    }

}
