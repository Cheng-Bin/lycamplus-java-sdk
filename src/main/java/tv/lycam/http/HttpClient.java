package tv.lycam.http;

import okhttp3.*;
import tv.lycam.config.Constant;
import tv.lycam.exception.LycamPlusException;
import tv.lycam.model.OAuthModel;
import tv.lycam.oauth2.LycamPlusOAuth2;
import com.github.scribejava.core.model.OAuth2AccessToken;
import tv.lycam.utils.TimeUtil;

import java.io.IOException;
import java.sql.Time;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by chapin on 17/1/18.
 */
public class HttpClient {

    private static final MediaType MEDIA_TYPE_JSON  = MediaType.parse("text/json; charset=utf-8");

    private OkHttpClient client;
    private LycamPlusOAuth2 lycamPlusOAuth2;
    private static OAuth2AccessToken appToken = null;
    private static Calendar oldDate;


    public HttpClient(OAuthModel oAuthModel) {
        lycamPlusOAuth2 = new LycamPlusOAuth2(oAuthModel);
        client = new OkHttpClient.Builder()
                .addInterceptor(httpInterceptor)
                .build();
    }

    /**
     *
     *  http get method.
     *
     * @param url
     * @return
     */
    public String Get(String url) throws Exception{
        Response response = null;
        Request request = new Request.Builder().url(url).build();

        response = client.newCall(request).execute();


        if (response.isSuccessful()) {
            return response.body().string();
        } else {
            throw new LycamPlusException(response.code(), response.message());
        }
    }

    /**
     * http post method.
     *
     * @param url
     * @param jsonStr
     * @return
     * @throws IOException
     */
    public String Post(String url, String jsonStr) throws Exception {


        Request request = new Request.Builder()
                        .url(url)
                        .post(RequestBody.create(MEDIA_TYPE_JSON, jsonStr))
                        .build();

        Response response = client.newCall(request).execute();

        if (response.isSuccessful()) {
            return response.body().string();
        } else {
            throw new LycamPlusException(response.code(), response.message());
        }
    }

    /**
     * http put method.
     *
     * @param url
     * @param jsonStr
     * @return
     */
    public String Put(String url, String jsonStr) throws Exception{


        Request request = new Request.Builder()
                        .url(url)
                        .put(RequestBody.create(MEDIA_TYPE_JSON, jsonStr))
                        .build();

        Response  response = client.newCall(request).execute();


        if (response.isSuccessful()) {
            return response.body().string();
        } else {
            throw new LycamPlusException(response.code(), response.message());
        }

    }

    /**
     * http delete method.
     * @param url
     * @return
     */
    public String Delete(String url) throws Exception {
        Request request = new Request.Builder()
                        .url(url)
                        .delete()
                        .build();
        Response response = client.newCall(request).execute();


        if (response.isSuccessful()) {
            return response.body().string();
        } else {
            throw new LycamPlusException(response.code(), response.message());
        }
    }


    /**
     * http Authenticator
     */
    private Interceptor httpInterceptor = new Interceptor() {

        @Override
        public Response intercept(Chain chain) throws IOException {

            Request request = chain.request();


            if (appToken == null || TimeUtil.isExpires(oldDate.getTime())) {
                appToken = lycamPlusOAuth2.getToken();
                oldDate = TimeUtil.getCurrentTime();
                oldDate.add(Calendar.SECOND, appToken.getExpiresIn());
            }

            String token = appToken.getAccessToken();
            Request.Builder requestBuilder = request.newBuilder()
                    .header(Constant.HEADER_AUTHORIZATION, Constant.HEADER_BEARER + token);
            request = requestBuilder.build();

            return chain.proceed(request);
        }
    };




}
