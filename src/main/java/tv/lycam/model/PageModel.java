package tv.lycam.model;

import java.io.Serializable;

/**
 * Created by lycamandroid on 17/1/19.
 */
public class PageModel implements Serializable {

    private int resultsPerPage;
    private int page;
    private String sort;
    private String order;

    public int getResultsPerPage() {
        return resultsPerPage;
    }

    public void setResultsPerPage(int resultsPerPage) {
        this.resultsPerPage = resultsPerPage;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }
}
