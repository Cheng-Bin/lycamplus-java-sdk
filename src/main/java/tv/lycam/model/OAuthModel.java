package tv.lycam.model;

import tv.lycam.config.Constant;

/**
 * Created by chapin on 17/1/18.
 */
public class OAuthModel {

    private String appKey;
    private String appSecret;
    private String userName = Constant.USER_NAME;
    private String masterToken;


    public OAuthModel(String appKey, String appSecret, String masterToken) {
        this.appKey = appKey;
        this.appSecret = appSecret;
        this.masterToken = masterToken;
    }

    public String getAppKey() {
        return appKey;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }

    public String getAppSecret() {
        return appSecret;
    }

    public void setAppSecret(String appSecret) {
        this.appSecret = appSecret;
    }

    public String getMasterToken() {
        return masterToken;
    }

    public void setMasterToken(String masterToken) {
        this.masterToken = masterToken;
    }

    public void setUserName(String userName) { this.userName = userName; }

    public String getUserName() { return userName; }
}
