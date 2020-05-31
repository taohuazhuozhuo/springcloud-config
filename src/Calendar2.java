import javafx.scene.input.DataFormat;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.SimpleFormatter;

/**
 * @author Tao
 * @date 2020/5/29 - 15:49
 */
public class Calendar2 {
    public static void main(String[] args) throws ParseException {


        String str = "2020-9-10";
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");

        Date date = df.parse(str);

        Calendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        System.out.println("日\t一\t二\t三\t四\t五\t六");
        int day=calendar.get(Calendar.DAY_OF_MONTH);
        calendar.set(Calendar.DAY_OF_MONTH, 1);




        for (int j = 0; j < calendar.get(Calendar.DAY_OF_WEEK) - 1; j++) {
            System.out.print("\t");

        }
        int days = calendar.getActualMaximum(Calendar.DATE);
        for (int i = 1; i <= days; i++) {
            if (i == day) {
                System.out.print(calendar.get(Calendar.DAY_OF_MONTH) + "*"+"\t");

            } else {
                System.out.print(calendar.get(Calendar.DAY_OF_MONTH) + "\t");
            }
            if (calendar.get(Calendar.DAY_OF_WEEK) == 7) {

                System.out.println();
            }
            calendar.add(Calendar.DAY_OF_MONTH, 1);

        }

    }
}
