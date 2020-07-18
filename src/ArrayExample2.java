public class ArrayExample2 {

    public static void main(String[] args) {


        int[] a = {23,34,21,21,34,23,434,67,89};

        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");

        char[] c = {'f','e','r','a','t','g'};


        System.out.println();
        for(int i=0;i<c.length;i++)
            System.out.print(c[i]+" ");

        double[] d ={34.5,5.6,2.4,5.9,2.5,1.2};
        System.out.println();
        for(int i=0;i<d.length;i++)
            System.out.print(d[i]+" ");


        String[] stArr = {"abcd1","abcd2","abcd3","abcd4","abcd5","abcd6"};
        System.out.println();
        for(int i=0;i<stArr.length;i++)
            System.out.print(stArr[i]+" ");


    }

}


