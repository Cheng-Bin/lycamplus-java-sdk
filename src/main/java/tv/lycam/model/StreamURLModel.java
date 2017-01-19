package tv.lycam.model;

import java.io.Serializable;

/**
 * Created by chapin on 17/1/18.
 */
public class StreamURLModel implements Serializable {

    private String type;
    private String url;
    private String bitrate;


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getBitrate() {
        return bitrate;
    }

    public void setBitrate(String bitrate) {
        this.bitrate = bitrate;
    }
}
