import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DtringIntodate {

    public static void main(String[] args) throws ParseException {

        String dateStr = "07/16/2020";
        SimpleDateFormat sd  = new SimpleDateFormat("MM/dd/yyyy");
        System.out.println(sd.parse(dateStr));

        String str1 = "Thursday 2016/06/23";
        SimpleDateFormat sd1 = new SimpleDateFormat("EEEE yyyy/MM/dd");
        System.out.println(sd1.parse(str1));

        String str2 = "23-06-2016 |  thu | 8:34";
        SimpleDateFormat sd2 = new SimpleDateFormat("dd-MM-yyyy |  E | h:mm");

        System.out.println(sd2.parse(str2));

        String str3 = "8:34:22";

        SimpleDateFormat sd3 = new SimpleDateFormat("h:mm:ss");
        System.out.println(sd3.parse(str3));


    }
}
