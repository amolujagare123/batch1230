import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

    public static void main(String[] args) {

        Date date = new Date();

        // Conversion of Date into String

        System.out.println(date);

        SimpleDateFormat sd = new SimpleDateFormat("dd-MM-yyyy");

        String dateStr = sd.format(date);

        System.out.println(dateStr);

        // dd | MMMM yy h:mm
        SimpleDateFormat sd2 = new SimpleDateFormat("dd | MMMM yy h:mm");
        System.out.println(sd2.format(date));


        SimpleDateFormat sd3 = new SimpleDateFormat("yyyy - MM - dd | h :mm:ss");
        System.out.println(sd3.format(date));


        SimpleDateFormat sd4 = new SimpleDateFormat("EEEE yyyy/MM/dd");
        System.out.println(sd4.format(date));



        SimpleDateFormat sd5 = new SimpleDateFormat("dd-MM-yyyy | E | d:hh");
        System.out.println(sd5.format(date));

        SimpleDateFormat sd6 = new SimpleDateFormat("h:mm:ss");
        System.out.println(sd6.format(date));

    }

}
