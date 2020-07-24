public class Stringcomparison {

    public static void main(String[] args) {


        String str1 = "amol";
        String str2 = "amol";
        String str3 = "Amol";
        String str4 = "Priyanka";
        String str5 = "aMOL";
        String str6 = new String("amol");
        String str7 = new String("Rahul");

/*

        System.out.println(str1.equals(str2)); // true
        System.out.println(str1.equals(str3)); // false
        System.out.println(str1.equalsIgnoreCase(str3)); // true
        System.out.println(str1.equalsIgnoreCase(str5)); // true
        System.out.println(str1.equalsIgnoreCase(str6)); // true
*/



        System.out.println(str1==str2) ; // true

        System.out.println(str1==str6) ; // false









        /// System.out.println(str1==str2) ; // true
        // this will compare addesses of the strings not the strings

        // if i am comparing 2 different values what could be the result of comparison
        // true or false ?

        //System.out.println(str1.equals(str2)); // true

//str2.equals(str1)

    }

}
