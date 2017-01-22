package tv.lycam.model;

import tv.lycam.enumeration.Order;
import tv.lycam.enumeration.Sort;

import java.io.Serializable;

/**
 * Created by lycamandroid on 17/1/19.
 */
public class PageModel implements Serializable {

    private  int resultsPerPage;
    private int page;
    private Sort sort;
    private Order order;

    public PageModel(){}

    public PageModel(int resultsPerPage, int pageNumber, Sort sort, Order order) {
        this.resultsPerPage = resultsPerPage;
        this.page = pageNumber;
        this.sort = sort;
        this.order = order;
    }

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
        return sort.getValue();
    }

    public void setSort(Sort sort) {
        this.sort = sort;
    }

    public String getOrder() {
        return order.getValue();
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
