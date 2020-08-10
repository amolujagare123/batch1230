package ExcetionDemos;

public class ExceptionDemo2 {

    public static void main(String[] args) {

        int[] a = new int[3];

        System.out.println("Lets fill up this array");

        try {


            a[0] = 89;
            a[1] = 34;
            a[2] = 56;
           // a[3] = 89;
        }
        catch (Exception e)
        {
            /*System.out.println("inside catch");
            System.out.println(e);
            System.out.println(e.getMessage());
            System.out.println(e.getClass());*/
            e.printStackTrace();
        }

        finally {
            System.out.println("inside finally");
        }
        System.out.println("array is filled up ");
        System.out.println("its size id:"+a.length);

    }
}
