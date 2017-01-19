package tv.lycam.model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by lycamandroid on 17/1/18.
 */
public class StreamResponseModelList implements Serializable {


    private int totoalItems;
    private int resultsPerPage;
    private int pageNumber;
    private boolean nextPageAvailable;
    private ArrayList<StreamResponseModel> items;

    public int getTotoalItems() {
        return totoalItems;
    }

    public void setTotoalItems(int totoalItems) {
        this.totoalItems = totoalItems;
    }

    public int getResultsPerPage() {
        return resultsPerPage;
    }

    public void setResultsPerPage(int resultsPerPage) {
        this.resultsPerPage = resultsPerPage;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public boolean isNextPageAvailable() {
        return nextPageAvailable;
    }

    public void setNextPageAvailable(boolean nextPageAvailable) {
        this.nextPageAvailable = nextPageAvailable;
    }

    public ArrayList<StreamResponseModel> getItems() {
        return items;
    }

    public void setItems(ArrayList<StreamResponseModel> items) {
        this.items = items;
    }
}
