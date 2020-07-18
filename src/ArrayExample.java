public class ArrayExample {
    public static void main(String[] args) {

        int[] a = new int[5];

        a[0] =11;
        a[1] =23;
        a[2] =34;
        a[3]= 45;
        a[4] =56;

        // length of the array = a

        //System.out.println(a[3]);
     /*  for(int i=0;i<5;i++)
        {
            System.out.println(a[i]);
        }*/

        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }

        // print even or odd infront of each number --- Homework

    }

}
