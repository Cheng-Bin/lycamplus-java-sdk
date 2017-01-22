package tv.lycam;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import tv.lycam.api.StreamAPI;
import tv.lycam.api.UserAPI;
import tv.lycam.model.OAuthModel;
import tv.lycam.oauth2.LycamPlusOAuth2;

/**
 * Created by lycamandroid on 17/1/22.
 */
public class LycamPlusTest {

    protected static String appKey;
    protected static String appSecret;
    protected static  String masterSercet;
    protected static UserAPI userInstance;
    protected static StreamAPI streamInstance;


    @BeforeClass
    public static void beforeClass() {
        appKey = "488ITUGN1G";
        appSecret = "z1oyx55jNQEXeRUu1iltfINZegWuGx";
        masterSercet = "9O1MZJ5UJwnuZky3tUBiZFPAlDJNs2";

        LycamPlus lycamPlus = new LycamPlus(appKey, appSecret, masterSercet);
        userInstance = lycamPlus.getUserInstance();
        streamInstance = lycamPlus.getStreamInstance();

    }

    @AfterClass
    public static void afterClass() {
        appKey = null;
        appSecret = null;
        masterSercet = null;
        userInstance = null;
    }

}
