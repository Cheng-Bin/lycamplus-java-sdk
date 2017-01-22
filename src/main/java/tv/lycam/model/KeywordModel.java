package tv.lycam.model;

import tv.lycam.enumeration.Order;
import tv.lycam.enumeration.Sort;

import java.io.Serializable;

/**
 * Created by lycamandroid on 17/1/18.
 */
public class KeywordModel extends PageModel implements Serializable {

    public KeywordModel() {}

    public KeywordModel(String keyword) {
        this.keyword = keyword;
    }

    public KeywordModel(int resultsPerPage, int pageNumber, Sort sort, Order order, String keyword) {
        super(resultsPerPage, pageNumber, sort, order);
        this.keyword = keyword;
    }

    private String keyword;

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }
}
