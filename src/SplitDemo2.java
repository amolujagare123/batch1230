public class SplitDemo2 {


    public static void main(String[] args) {
        String str = "hey baby you are so lovely";

     //   print only the words that ends with 'y'

        String[] stArr = str.split(" ");
        //=> {"hey","baby","you","are","so","lovely"}

        for(int i=0;i<stArr.length;i++)
        {
            String currentString = stArr[i]; // i=0 - stArr[0] -> "Hey" - str.charAt(l-1)

            int lengthCurrentstring = currentString.length(); // 3

            if(currentString.charAt(lengthCurrentstring-1)=='y')
                        System.out.println(stArr[i]);
        }



    }
}
