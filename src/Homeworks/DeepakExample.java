package Homeworks;

public class DeepakExample {

    String[][] getString1(String[][] name)
    {
        for(String deepak[]:name) // for each
        {
            for(String phani:deepak)
            {
                System.out.print(phani+" ");
            }
            System.out.println();
        }
       /* for(int i =0;i<name.length;i++) {
            for(int j=0;j<name[0].length;j++)
            {
                System.out.println(name[i][j]);
            }
        }*/
        return name;
    }

    public static void main(String[] args) {
        DeepakExample m = new DeepakExample();

        String[][] xyz= {{"aaa","jjj"},{"uuu","oooo"}};

        m.getString1(xyz);




           /* String[][] pqr =   m.getString1(xyz);

            for(int i=0;i<pqr.length;i++)
            {
                for (int j=0;j<pqr[0].length;j++)
                {
                    System.out.print(pqr[i][j]+" ");
                }
                System.out.println();
            }*/

    }
}
