package tv.lycam.oauth;

import com.github.scribejava.core.model.OAuth2AccessToken;
import org.junit.*;
import tv.lycam.config.Constant;
import tv.lycam.model.OAuthModel;
import tv.lycam.oauth2.LycamPlusOAuth2;

import java.io.IOException;

/**
 * Created by lycamandroid on 17/1/18.
 */
public class OAuth2Test {

    private static String appKey;
    private static String appSecret;
    private static  String masterSercet;
    private static LycamPlusOAuth2 lycamPlusOAuth2;

    @BeforeClass
    public static void beforeClass() {
        appKey = "488ITUGN1G";
        appSecret = "z1oyx55jNQEXeRUu1iltfINZegWuGx";
        masterSercet = "9O1MZJ5UJwnuZky3tUBiZFPAlDJNs2";

        OAuthModel oAuthModel = new OAuthModel(appKey, appSecret, masterSercet);
        lycamPlusOAuth2 = new LycamPlusOAuth2(oAuthModel);
    }

    @AfterClass
    public static void afterClass() {
        appKey = null;
        appSecret = null;
        masterSercet = null;
        lycamPlusOAuth2 = null;
    }

    @Test
    public void testOAuth2() {
        try {
            OAuth2AccessToken token = lycamPlusOAuth2.getToken();
            System.out.println(token);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
