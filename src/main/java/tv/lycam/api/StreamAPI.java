package tv.lycam.api;

import com.google.gson.Gson;
import tv.lycam.config.Constant;
import tv.lycam.http.HttpClient;
import tv.lycam.model.*;
import tv.lycam.utils.QueryUtil;

/**
 *
 *  Created by chapin on 17/1/18.
 *
 */
public class StreamAPI {


    private HttpClient httpClient;
    private Gson gson;

    /**
     * constructor
     *
     * @param oAuthModel
     */
    public StreamAPI(OAuthModel oAuthModel) {
        httpClient = new HttpClient(oAuthModel);
        gson = new Gson();
    }


    /**
     * create a stream 
     *
     * @param requestModel
     * @return
     */
    public StreamResponseModel create(StreamRequestModel requestModel) {

        String url = String.format("%s/%s", Constant.API_BASE_URL, "streams");
        String jsonStr = gson.toJson(requestModel);


        String responseJson = null;
        try {
            responseJson = httpClient.Post(url, jsonStr);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return gson.fromJson(responseJson, StreamResponseModel.class);
    }


    /**
     *
     * modify video stream
     *
     * @param streamID
     * @param requestModel
     * @return
     */
    public StreamResponseModel update(String streamID, StreamRequestModel requestModel) {
        String url = String.format("%s/%s/%s", Constant.API_BASE_URL, "streams", streamID);

        String jsonStr = gson.toJson(requestModel);

        String responseJson = null;
        try {
            responseJson = httpClient.Put(url, jsonStr);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return gson.fromJson(responseJson, StreamResponseModel.class);
    }

    /**
     * get video stream By ID.
     *
     * @param streamID
     * @return
     */
    public StreamResponseModel show(String streamID) {
        String url = String.format("%s/%s/%s", Constant.API_BASE_URL, "streams", streamID);

        String responseJson = null;
        try {
            responseJson = httpClient.Get(url);
        } catch (Exception e) {
            e.printStackTrace();
        }


        return gson.fromJson(responseJson, StreamResponseModel.class);
    }

    /**
     * Get video list by PageModel
     *
     * @param pageModel
     * @return
     */
    public StreamResponseListModel getList(PageModel pageModel) {
        String queryString = QueryUtil.format(pageModel);
        String url = String.format("%s/%s?%s", Constant.API_BASE_URL, "streams", queryString);

        String responseJson = null;
        try {
            responseJson = httpClient.Get(url);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return gson.fromJson(responseJson, StreamResponseListModel.class);
    }


    /**
     * Get video List by timestamp.
     *
     * @param timestamp
     * @param pageModel
     * @return
     */
    public StreamResponseListModel getListSince(long timestamp, PageModel pageModel) {

        String queryString = QueryUtil.format(pageModel);

        String url = String.format("%s/%s/%s/%d?%s", Constant.API_BASE_URL, "streams", "since", timestamp, queryString);

        String responseJson = null;

        try {
            responseJson = httpClient.Get(url);
            System.out.println(responseJson);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return gson.fromJson(responseJson, StreamResponseListModel.class);
    }

    /**
     * Search video stream by KeywordModel
     *
     * @param keywordModel
     * @return
     */
    public StreamSearchListModel getListByKeyword(KeywordModel keywordModel) {

        String url = String.format("%s/%s", Constant.API_BASE_URL, "search");
        String jsonStr = gson.toJson(keywordModel);

        String responseJson = null;
        try {
            responseJson = httpClient.Post(url, jsonStr);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return gson.fromJson(responseJson, StreamSearchListModel.class);

    }

    /**
     * Search video stream by LocationModel
     *
     * @param locationModel
     * @return
     */
    public StreamSearchListModel getListByLocation(LocationModel locationModel) {

        String url = String.format("%s/%s/%s", Constant.API_BASE_URL, "search", "location");
        String jsonStr = gson.toJson(locationModel);

        String responseJson = null;
        try {
            responseJson = httpClient.Post(url, jsonStr);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return gson.fromJson(responseJson, StreamSearchListModel.class);
    }


    /**
     *
     *  Delete video stream by ID.
     *
     * @param streamID
     * @return
     */
    public SuccessModel delete(String streamID) {
        String url = String.format("%s/%s/%s", Constant.API_BASE_URL, "streams", streamID);
        String responseJson = null;
        try {
            responseJson = httpClient.Delete(url);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return gson.fromJson(responseJson, SuccessModel.class);
    }



}
