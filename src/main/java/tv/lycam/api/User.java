package tv.lycam.api;

import com.google.gson.Gson;
import tv.lycam.config.Constant;
import tv.lycam.exception.LycamPlusException;
import tv.lycam.http.HttpClient;
import tv.lycam.model.OAuthModel;
import tv.lycam.model.TokenResponseModel;
import tv.lycam.model.UserRequestModel;
import tv.lycam.model.UserResponseModel;

import java.io.IOException;

/**
 * Created by lycamandroid on 17/1/18.
 */
public class User {

    private HttpClient httpClient;
    private Gson gson;

    /**
     * constuctor
     *
     * @param oAuthModel
     */
    public User(OAuthModel oAuthModel) {
        httpClient = new HttpClient(oAuthModel);
        gson = new Gson();
    }


    /**
     * Create a User
     *
     * @param userRequestModel
     * @return
     * @throws LycamPlusException
     */
    public UserResponseModel create(UserRequestModel userRequestModel) {

        String url = String.format("%s/%s", Constant.API_BASE_URL, "users");

        String jsonStr = gson.toJson(url);

        String responseJson = null;
        try {

            responseJson = httpClient.Post(url, jsonStr);

        } catch (IOException e) {
            e.printStackTrace();
        }

        return gson.fromJson(responseJson, UserResponseModel.class);
    }

    /**
     *  get Token for uuid.
     *
     * @param uuid
     * @return
     */
    public TokenResponseModel getToken(String uuid) {

        return null;
    }




}
