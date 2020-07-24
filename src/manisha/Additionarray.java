package manisha;

public class Additionarray {
    public static void main(String[] args) {

        int[][] a = {{1,1,1},{1,1,1},{1,1,1}};
        int[][] b = {{2,2,2},{2,2,2},{2,2,2}};
        int[][] c = new int[3][3];
        int[][] d = new int[3][3];

        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[0].length;j++)
                System.out.print(a[i][j]+" ");

            System.out.println();
        }
        System.out.println("====Another 2d  array===");

        for(int i=0;i<b.length;i++)
        {
            for(int j=0;j<b[0].length;j++)
                System.out.print(b[i][j]+" ");

            System.out.println();
        }


        for(int i=0;i<c.length;i++)
        {
            for(int j=0;j<c[0].length;j++) {

                c[i][j] = a[i][j] + b[i][j];

            }

        }

        System.out.println("====the  2d  array  'c' - addition ===");

        for(int i=0;i<c.length;i++)
        {
            for(int j=0;j<c[0].length;j++)
                System.out.print(c[i][j]+" ");

            System.out.println();
        }


        for(int i=0;i<d.length;i++)
        {
            for(int j=0;j<d[0].length;j++)
            {
                d[i][j] =0 ;

                for(int k=0; k<3;k++)
                {
                    d[i][j] = d[i][j] + a[k][j] * b[i][k];
                }


            }

        }


        System.out.println("====the Multiplication ===");

        for(int i=0;i<d.length;i++)
        {
            for(int j=0;j<d[0].length;j++)
                System.out.print(d[i][j]+" ");

            System.out.println();
        }


    }

}
