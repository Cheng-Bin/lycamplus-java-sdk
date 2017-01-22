package tv.lycam.model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by chapin on 17/1/18.
 */
public class StreamResponseListModel implements Serializable {


    private int totalItems;

    private int resultsPerPage;
    private int pageNumber;
    private boolean nextPageAvailable;
    private ArrayList<StreamResponseModel> items;

    public int getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(int totalItems) {
        this.totalItems = totalItems;
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

    @Override
    public String toString() {
        return "StreamResponseListModel{" +
                "totoalItems=" + totalItems +
                ", resultsPerPage=" + resultsPerPage +
                ", pageNumber=" + pageNumber +
                ", nextPageAvailable=" + nextPageAvailable +
                ", items=" + items +
                '}';
    }
}
