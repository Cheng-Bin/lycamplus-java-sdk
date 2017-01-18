package tv.lycam.http;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import tv.lycam.config.Constant;
import tv.lycam.model.OAuthModel;
import tv.lycam.oauth2.LycamPlusOAuth2;
import com.github.scribejava.core.model.OAuth2AccessToken;

import java.io.IOException;

/**
 * Created by chapin on 17/1/18.
 */
public class HttpClient {

    private OkHttpClient client;
    private LycamPlusOAuth2 lycamPlusOAuth2;


    public HttpClient(OAuthModel oAuthModel) {
        lycamPlusOAuth2 = new LycamPlusOAuth2(oAuthModel);
        client = new OkHttpClient.Builder()
                .addInterceptor(headerInterceptor)
                .build();
    }


    /**
     * http header interceptor
     */
    Interceptor headerInterceptor = new Interceptor() {
        @Override
        public Response intercept(Chain chain) throws IOException {
            OAuth2AccessToken tokenObject = lycamPlusOAuth2.getToken();

            String token = tokenObject.getAccessToken();
            Request request = chain.request()
                    .newBuilder()
                    .addHeader(Constant.HEADER_AUTHORIZATION, Constant.HEADER_BEARER + token)
                    .build();
            return chain.proceed(request);
        }
    };


}
