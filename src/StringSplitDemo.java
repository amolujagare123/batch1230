public class StringSplitDemo {


    public static void main(String[] args) {
        String str = "this is a java program";
        String[] stArr = str.split(" ");
        // regex - a variable name that the function 'split' takes as an argument

        for(int i = 0 ; i< stArr.length;i++ )
            System.out.println(stArr[i]);

           }




}
