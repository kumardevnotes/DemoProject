import java.text.SimpleDateFormat;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateClass {
    public static void main(String args[]){
        System.out.println("current Date Example");
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/YY");
        System.out.println(formatter.format(currentDate));


        formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        System.out.println("custom Date Example");
        LocalDate dt = LocalDate.parse("2018-11-01");
        System.out.println(dt);
        System.out.println(formatter.format(dt));

    }

}
