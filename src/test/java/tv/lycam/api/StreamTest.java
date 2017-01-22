package tv.lycam.api;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import tv.lycam.LycamPlusTest;
import tv.lycam.enumeration.Order;
import tv.lycam.model.*;

import java.sql.Time;
import java.sql.Timestamp;

/**
 * Created by lycamandroid on 17/1/22.
 */
public class StreamTest extends LycamPlusTest {


    @Test
    public void create() {
        StreamRequestModel requestModel = new StreamRequestModel();
        requestModel.setTitle("java test");
        requestModel.setUser("f6524e90-e055-11e6-9b86-4d1c174d4365");

        StreamResponseModel responseModel = streamInstance.create(requestModel);

        System.out.print(responseModel);
    }

    @Test
    public void update() {
        String streamID = "775009d0-e06d-11e6-ba8a-a3de0ac619fb";

        StreamRequestModel requestModel = new StreamRequestModel();
        requestModel.setStartLat(90);
        requestModel.setStartLon(90);
        requestModel.setEndLat(180);
        requestModel.setEndLon(220);
        requestModel.setDescription("no description");

        StreamResponseModel responseModel = streamInstance.update(streamID, requestModel);

        System.out.println(responseModel);
    }


    @Test
    public void show() {
        String streamID = "775009d0-e06d-11e6-ba8a-a3de0ac619fb";
        StreamResponseModel responseModel =  streamInstance.show(streamID);

        System.out.println(responseModel);
    }

    @Test
    public void getList() {
        PageModel pageModel = new PageModel();
        pageModel.setResultsPerPage(2);
        pageModel.setPage(3);
        pageModel.setOrder(Order.DESC);

        StreamResponseListModel listModel = streamInstance.getList(pageModel);

        System.out.println(listModel);
    }


    @Test
    public void getListSince() {
        PageModel pageModel = new PageModel();
        pageModel.setResultsPerPage(2);
        pageModel.setPage(2);
        pageModel.setOrder(Order.DESC);

        String tsStr = "2016-12-30 11:49:45";
        Timestamp timestamp = Timestamp.valueOf(tsStr);
        StreamResponseListModel listModel = streamInstance.getListSince(timestamp.getTime(), pageModel);

        System.out.println(listModel);
    }


    @Test
    public void getListBykeyword() {
        KeywordModel keywordModel = new KeywordModel();
        keywordModel.setKeyword("test");
        StreamSearchListModel listModel = streamInstance.getListByKeyword(keywordModel);
        System.out.println(listModel);
    }


    @Test
    public void getListByLocation() {
        LocationModel locationModel = new LocationModel();
        locationModel.setLat(90);
        locationModel.setLon(90);
        locationModel.setRadius(100);

        StreamSearchListModel listModel = streamInstance.getListByLocation(locationModel);
        System.out.println(listModel);
    }


    @Test
    public void delete() {
        String streamID = "775009d0-e06d-11e6-ba8a-a3de0ac619fb";
        SuccessModel successModel = streamInstance.delete(streamID);
        System.out.println(successModel);
    }

}
