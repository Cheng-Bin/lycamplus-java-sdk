package tv.lycam.utils;

import org.junit.Test;

import java.util.Date;

/**
 * Created by lycamandroid on 17/1/22.
 */
public class TimeTest {

    @Test
    public void TestTime(){
        Date time = new Date();
        System.out.println(TimeUtil.isExpires(time));
    }

}
