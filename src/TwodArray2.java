public class TwodArray2 {

    public static void main(String[] args) {

        // row x col -> 3 x 4

        int[][] a = { {45,12,34,11} ,  {12,45,78,90}, {12,11,34,656}  };

        for(int i=0;i<a.length;i++) // use of i is to traverse the rows
        {
            for(int j=0;j<a[0].length;j++) // use of i is to traverse the colums
            {
                System.out.print(a[i][j]+" ");
            }

            System.out.println();
        }

        // Home work define 2 dimetional arrays (of type double , char , string)
        // & print - double , char , sting - keep diffrenet
        // take 2 arrays of size 3 x 3 do - addition & multiplication

    }
}
