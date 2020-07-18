public class TwoDarray {

    public static void main(String[] args) {

        int[][] a = new int[3][4];

        a[0][0] =12;
        a[0][1] =22;
        a[0][2] =32;
        a[0][3] =32;

        a[1][0] =13;
        a[1][1] =25;
        a[1][2] =31;
        a[1][3] =38;

        a[2][0] =11;
        a[2][1] =21;
        a[2][2] =12;
        a[2][3] =72;

        int row = a.length;
        int col = a[0].length;

        System.out.println("row="+row);
        System.out.println("col="+col);

        for(int i=0;i<a.length;i++) // use of i is to traverse the rows
        {
            for(int j=0;j<a[0].length;j++) // use of i is to traverse the colums
            {
                System.out.print(a[i][j]+" ");
            }

            System.out.println();
        }



    }
}
