package WrapperClassDemo;

public class WrapperClassMethods {

    public static void main(String[] args) {

        String str1 = "123";
        String str2 = "123";

        System.out.println(str1+str2);

        int a = Integer.parseInt(str1);
        int b = Integer.parseInt(str2);

        System.out.println(a+b);

        String str4 ="23.6";
        String str5 ="12.5";

        System.out.println(str4+str5);

        double d1 = Double.parseDouble(str4);
        double d2 = Double.parseDouble(str5);

        System.out.println(d1+d2);


        String str6 = "g";

        char ch = str6.charAt(0);

       /* char[] ch =  str6.toCharArray();

          char chelement =  ch[0];

        System.out.println(chelement);*/

    }
}
