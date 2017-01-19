package tv.lycam.http;

import okhttp3.*;
import tv.lycam.config.Constant;
import tv.lycam.exception.LycamPlusException;
import tv.lycam.model.OAuthModel;
import tv.lycam.oauth2.LycamPlusOAuth2;
import com.github.scribejava.core.model.OAuth2AccessToken;

import java.io.IOException;

/**
 * Created by chapin on 17/1/18.
 */
public class HttpClient {

    private static final MediaType MEDIA_TYPE_JSON  = MediaType.parse("text/json; charset=utf-8");

    private OkHttpClient client;
    private LycamPlusOAuth2 lycamPlusOAuth2;


    public HttpClient(OAuthModel oAuthModel) {
        lycamPlusOAuth2 = new LycamPlusOAuth2(oAuthModel);
        client = new OkHttpClient.Builder()
                .addInterceptor(headerInterceptor)
                .build();
    }

    /**
     *
     *  http get method.
     *
     * @param url
     * @return
     */
    public String Get(String url) throws IOException{
        Response response = null;
        Request request = new Request.Builder().url(url).build();

        response = client.newCall(request).execute();


        if (response.isSuccessful()) {
            return response.body().toString();
        }

        return null;
    }

    /**
     * http post method.
     *
     * @param url
     * @param jsonStr
     * @return
     * @throws IOException
     */
    public String Post(String url, String jsonStr) throws IOException {


        Request request = new Request.Builder()
                        .url(url)
                        .post(RequestBody.create(MEDIA_TYPE_JSON, jsonStr))
                        .build();

        Response response = client.newCall(request).execute();


        if (response.isSuccessful()) {
           response.body().toString();
        }

        return null;
    }

    /**
     * http put method.
     *
     * @param url
     * @param jsonStr
     * @return
     */
    public String Put(String url, String jsonStr) throws IOException{


        Request request = new Request.Builder()
                        .url(url)
                        .put(RequestBody.create(MEDIA_TYPE_JSON, jsonStr))
                        .build();

        Response  response = client.newCall(request).execute();


        if (response.isSuccessful()) {
            return response.body().toString();
        }

        return null;
    }

    /**
     * http delete method.
     * @param url
     * @return
     */
    public String Delete(String url) throws IOException {
        Request request = new Request.Builder()
                        .url(url)
                        .delete()
                        .build();
        Response response = client.newCall(request).execute();


        if (response.isSuccessful()) {
            return response.body().toString();
        }

        return null;
    }

    /**
     * http header interceptor
     */
    private Interceptor headerInterceptor = new Interceptor() {
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
