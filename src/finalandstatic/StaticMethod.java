package finalandstatic;

public class StaticMethod {

    static String url ="http://facebook.com";

    public static String getUrl()
    {
       return url;
    }

    public static void main(String[] args) {

        StaticMethod ob = new StaticMethod();

        System.out.println(ob.getUrl());

        StaticMethod.getUrl();



    }

}
