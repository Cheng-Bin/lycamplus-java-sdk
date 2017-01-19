package tv.lycam.oauth2;

import com.github.scribejava.core.builder.ServiceBuilder;
import com.github.scribejava.core.builder.api.DefaultApi20;
import com.github.scribejava.core.model.OAuth2AccessToken;
import com.github.scribejava.core.oauth.OAuth20Service;
import tv.lycam.config.Constant;
import tv.lycam.model.OAuthModel;

import java.io.IOException;

/**
 * Created by chapin on 17/1/18.
 */
public class LycamPlusOAuth2 {

    private OAuthModel oAuthModel;
    private OAuth20Service oAuth20Service;


    /**
     * Constructor
     *
     * @param oAuthModel
     */
    public LycamPlusOAuth2(OAuthModel oAuthModel) {
        this.oAuthModel = oAuthModel;
        oAuth20Service = new ServiceBuilder()
                .apiKey(oAuthModel.getAppKey())
                .apiSecret(oAuthModel.getAppSecret())
                .build(LycamPlus2Api.instance());

    }

    /**
     * Get Token from LYCAM+ server .
     *
     * @return
     * @throws IOException
     */
    public OAuth2AccessToken getToken() throws IOException {
        return oAuth20Service.getAccessTokenPasswordGrant(oAuthModel.getUserName(),
                oAuthModel.getMasterToken());
    }



    /**
     *
     * LycamPlus2Api (inner class)
     *
     */
    private static class LycamPlus2Api extends DefaultApi20 {

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

}



