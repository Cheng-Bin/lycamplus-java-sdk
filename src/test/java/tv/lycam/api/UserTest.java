package tv.lycam.api;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import tv.lycam.LycamPlusTest;
import tv.lycam.model.TokenResponseModel;
import tv.lycam.model.UserRequestModel;
import tv.lycam.model.UserResponseModel;

/**
 * Created by lycamandroid on 17/1/22.
 */

public class UserTest extends LycamPlusTest {

    private static User userInstance;

    @BeforeClass
    public static void before() {
        userInstance = new User(oAuthModel);
    }

    @AfterClass
    public static void after() {
        userInstance = null;
    }

    @Test
    public void create() {
        UserRequestModel userRequestModel = new UserRequestModel();
        userRequestModel.setUsername("lycam-test2");
        UserResponseModel responseModel = userInstance.create(userRequestModel);
        System.out.print(responseModel);
    }

    @Test
    public void assume() {
        String uuid = "f6524e90-e055-11e6-9b86-4d1c174d4365";
        TokenResponseModel tokenResponseModel = userInstance.assume(uuid, 38000);
        System.out.print(tokenResponseModel.toString());
    }


}
