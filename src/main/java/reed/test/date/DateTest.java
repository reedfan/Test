package reed.test.date;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

/**
 * @author fanqunsong@corp.netease.com
 * @date 2018/5/23
 * @time 10:19
 */
public class DateTest {
    public static void main(String[] args) {
        /*Instant now = Instant.now();
        System.out.println(now);
        Date startDay = Date.from(now.minus(2, ChronoUnit.DAYS));
        System.out.println(startDay);*/

        long startTime = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());
        calendar.add(Calendar.DAY_OF_MONTH,-7);
        System.out.println(calendar.getTime());
        calendar.add(Calendar.HOUR_OF_DAY,-2);
        System.out.println(calendar.getTime());



    }
}
