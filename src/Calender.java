import javax.sound.midi.Soundbank;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @author Tao
 * @date 2020/5/29 - 15:28
 */
public class Calender {
    public static void main(String[] args) {
        Calendar calendar=new GregorianCalendar(2020,6,6,2,50);
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println(1+"");

    }
}
