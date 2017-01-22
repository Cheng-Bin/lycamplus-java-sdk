package tv.lycam;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import tv.lycam.model.OAuthModel;
import tv.lycam.oauth2.LycamPlusOAuth2;

/**
 * Created by lycamandroid on 17/1/22.
 */
public class LycamPlusTest {

    private static String appKey;
    private static String appSecret;
    private static  String masterSercet;
    protected static OAuthModel oAuthModel;


    @BeforeClass
    public static void beforeClass() {
        appKey = "488ITUGN1G";
        appSecret = "z1oyx55jNQEXeRUu1iltfINZegWuGx";
        masterSercet = "9O1MZJ5UJwnuZky3tUBiZFPAlDJNs2";
        oAuthModel = new OAuthModel(appKey, appSecret, masterSercet);
    }

    @AfterClass
    public static void afterClass() {
        appKey = null;
        appSecret = null;
        masterSercet = null;
        oAuthModel = null;
    }

}
