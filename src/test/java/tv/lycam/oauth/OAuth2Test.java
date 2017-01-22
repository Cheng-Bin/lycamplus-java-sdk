package tv.lycam.oauth;

import com.github.scribejava.core.model.OAuth2AccessToken;
import org.junit.*;
import tv.lycam.LycamPlusTest;
import tv.lycam.model.OAuthModel;
import tv.lycam.oauth2.LycamPlusOAuth2;

import java.io.IOException;

/**
 * Created by chapin on 17/1/18.
 */
public class OAuth2Test extends LycamPlusTest {

    private static LycamPlusOAuth2 lycamPlusOAuth2;

    @BeforeClass
    public static void before() {
        OAuthModel oAuthModel = new OAuthModel(appKey, appSecret, masterSercet);
        lycamPlusOAuth2 = new LycamPlusOAuth2(oAuthModel);
    }

    @AfterClass
    public static void after() {
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
