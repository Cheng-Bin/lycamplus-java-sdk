package tv.lycam.model;

import java.io.Serializable;

/**
 * Created by lycamandroid on 17/1/18.
 */
public class KeywordModel extends PageModel implements Serializable {
    private String keyword;

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }
}
