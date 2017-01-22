package tv.lycam.api;

import com.google.gson.Gson;
import tv.lycam.config.Constant;
import tv.lycam.exception.LycamPlusException;
import tv.lycam.http.HttpClient;
import tv.lycam.model.OAuthModel;
import tv.lycam.model.TokenResponseModel;
import tv.lycam.model.UserRequestModel;
import tv.lycam.model.UserResponseModel;


/**
 * Created by chapin on 17/1/18.
 */
public class UserAPI {

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

        String jsonStr = gson.toJson(userRequestModel);

        String responseJson = null;

        try {

            responseJson = httpClient.Post(url, jsonStr);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return gson.fromJson(responseJson, UserResponseModel.class);
    }


    /**
     *  get Token by uuid.
     *
     * @param uuid
     * @param expires token expires
     * @return
     */
    public TokenResponseModel assume(String uuid, long expires) {

        String url = String.format("%s/users/%s/assume", Constant.API_BASE_URL, uuid);

        String responseJson = null;

        try {
            String expiresJson = "{\"durationSeconds\":\"" + expires + "\"}";

            responseJson = httpClient.Post(url, expiresJson);

        } catch (Exception e) {
            e.printStackTrace();
        }


        return gson.fromJson(responseJson, TokenResponseModel.class);
    }




}
