public class Triangle {

    public static void main(String[] args) {

        int a = 10;
        int b = 80;
        int c = 90;

        if(a+b+c==180 && a>0 && b>0 && c>0 ) {

            if (a == b && b == c)
                System.out.println("Equilateral Triangle");
            if (a != b && b != c)
                System.out.println("Scalane Triangle");
            if (a == 90 || b == 90 || c == 90)
                System.out.println("Right angled triangle");

            if ((a == b && b != c) || (b == c && c != a) || (c == a && a != b))
                System.out.println("Isoscelence triagnle");
        }
        else
            System.out.println("This is not a triangle");
        
    }

}
