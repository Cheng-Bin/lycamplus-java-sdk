package tv.lycam;

import tv.lycam.api.StreamAPI;
import tv.lycam.api.UserAPI;
import tv.lycam.model.OAuthModel;

/**
 * Created by chapin on 17/1/18.
 */
public class LycamPlus {


    private OAuthModel oAuthModel;

    /**
     * construction
     *
     * @param appKey
     * @param appSecret
     * @param masterSecret
     */
    public LycamPlus(String appKey, String appSecret, String masterSecret) {
       oAuthModel = new OAuthModel(appKey, appSecret, masterSecret);
    }

    /**
     * Get User API Object
     *
     * @return
     */
    public UserAPI getUserInstance() {
        return new UserAPI(oAuthModel);
    }

    /**
     * Get Video Stream API Object
     *
     * @return
     */
    public StreamAPI getStreamInstance() {
        return new StreamAPI(oAuthModel);
    }

}
