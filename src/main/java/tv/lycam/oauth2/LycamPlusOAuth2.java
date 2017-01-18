package tv.lycam.oauth2;

import com.github.scribejava.core.builder.ServiceBuilder;
import com.github.scribejava.core.model.OAuth2AccessToken;
import com.github.scribejava.core.oauth.OAuth20Service;
import tv.lycam.model.OAuthModel;

import java.io.IOException;

/**
 * Created by chapin on 17/1/18.
 */
public class LycamPlusOAuth2 {

    private OAuthModel oAuthModel;
    private OAuth20Service oAuth20Service;


    public LycamPlusOAuth2(OAuthModel oAuthModel) {
        this.oAuthModel = oAuthModel;
        oAuth20Service = new ServiceBuilder()
                .apiKey(oAuthModel.getAppKey())
                .apiSecret(oAuthModel.getAppSecret())
                .build(LycamPlus2Api.instance());

    }





    /**
     * Get Token
     *
     * @return
     * @throws IOException
     */
    public OAuth2AccessToken getToken() throws IOException {
        return oAuth20Service.getAccessTokenPasswordGrant(oAuthModel.getUserName(),
                oAuthModel.getMasterToken());
    }

}
