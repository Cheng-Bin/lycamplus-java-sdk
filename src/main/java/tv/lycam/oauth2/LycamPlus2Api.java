package tv.lycam.oauth2;

import com.github.scribejava.apis.Foursquare2Api;
import com.github.scribejava.core.builder.api.DefaultApi20;
import tv.lycam.config.Constant;
import tv.lycam.model.OAuthModel;

/**
 * Created by chapin on 17/1/18.
 */
public class LycamPlus2Api extends DefaultApi20 {


    public LycamPlus2Api() {}

    private static class InstanceHolder {
        private static final LycamPlus2Api INSTANCE = new LycamPlus2Api();
    }

    public static LycamPlus2Api instance() {
        return InstanceHolder.INSTANCE;
    }

    @Override
    public String getAccessTokenEndpoint() {
        return Constant.AUTHORIZATION_ENDPOINT;
    }

    @Override
    protected String getAuthorizationBaseUrl() {
        return "";
    }
}
