package ExcetionDemos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Exceptiondemo4 {


    public static void main(String[] args) throws ParseException {

        // convert string to date

        String dateStr = "12/04/2020";

        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");

        Date date =  sd.parse(dateStr);


    }


}
