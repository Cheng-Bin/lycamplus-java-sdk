package tv.lycam.utils;

import sun.util.resources.CalendarData;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by chapin on 17/1/22.
 */
public class TimeUtil {

    /**
     *
     * @param date
     * @return  -1 not expires
     */
    public static boolean isExpires(Date date) {

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar c1=Calendar.getInstance();
        Calendar c2=Calendar.getInstance();
        try {
            c1.setTime(formatter.parse(format(new Date())));
            c2.setTime(formatter.parse(format(date)));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        int result=c1.compareTo(c2);

        return result == 1 || result == 0;
    }




    /**
     * getCurrentTime
     *
     * @return
     */
    public static Calendar getCurrentTime(){
        return Calendar.getInstance();
    }

    /**
     *
     * @param date
     * @return
     */
    public static String format(Date date) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString = formatter.format(date);
        return dateString;
    }

}
