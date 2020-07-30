package finalandstatic;

public class FinalVariabledemo {

    final int count  =10;

            void change()
            {
                //count =10;
            }

    public static void main(String[] args) {

        FinalVariabledemo ob = new FinalVariabledemo();

        ob.change();

        System.out.println(ob.count);
    }

}
