package tv.lycam;

import tv.lycam.model.OAuthModel;
import tv.lycam.http.HttpClient;

/**
 * Created by chapin on 17/1/18.
 */
public class LycamPlus {

    public LycamPlus(String appKey, String appSecret, String masterSecret) {

        OAuthModel oAuthModel = new OAuthModel(appKey, appSecret, masterSecret);
        HttpClient httpClient = new HttpClient(oAuthModel);

        // User

        // Stream


    }

}
