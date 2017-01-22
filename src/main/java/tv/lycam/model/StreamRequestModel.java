package tv.lycam.model;

import java.io.Serializable;

/**
 * Created by chapin on 17/1/18.
 *
 */
public class StreamRequestModel implements Serializable {

    private String user;
    private String title;
    private String description;
    private String thumbnailURL;
    private float startLat;
    private float startLon;
    private float endLat;
    private float endLon;
    private String country;
    private String State;
    private String city;
    private String privacy;

    public StreamRequestModel() {

    }

    public StreamRequestModel(String user, String title, String description, String thumbnailURL) {
        this.user = user;
        this.title = title;
        this.description = description;
        this.thumbnailURL = thumbnailURL;
    }

    public StreamRequestModel(String user, String title, String description, String thumbnailURL, String privacy) {
        this.user = user;
        this.title = title;
        this.description = description;
        this.thumbnailURL = thumbnailURL;
        this.privacy = privacy;
    }

    public StreamRequestModel(String user, String title, String description, String thumbnailURL, float startLat, float startLon, String country, String state, String city, String privacy) {
        this.user = user;
        this.title = title;
        this.description = description;
        this.thumbnailURL = thumbnailURL;
        this.startLat = startLat;
        this.startLon = startLon;
        this.country = country;
        State = state;
        this.city = city;
        this.privacy = privacy;
    }



    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getThumbnailURL() {
        return thumbnailURL;
    }

    public void setThumbnailURL(String thumbnailURL) {
        this.thumbnailURL = thumbnailURL;
    }

    public float getStartLat() {
        return startLat;
    }

    public void setStartLat(float startLat) {
        this.startLat = startLat;
    }

    public float getStartLon() {
        return startLon;
    }

    public void setStartLon(float startLon) {
        this.startLon = startLon;
    }

    public float getEndLat() {
        return endLat;
    }

    public void setEndLat(float endLat) {
        this.endLat = endLat;
    }

    public float getEndLon() {
        return endLon;
    }

    public void setEndLon(float endLon) {
        this.endLon = endLon;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPrivacy() {
        return privacy;
    }

    public void setPrivacy(String privacy) {
        this.privacy = privacy;
    }

    @Override
    public String toString() {
        return "StreamRequestModel{" +
                "user='" + user + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", thumbnailURL='" + thumbnailURL + '\'' +
                ", startLat=" + startLat +
                ", startLon=" + startLon +
                ", endLat=" + endLat +
                ", endLon=" + endLon +
                ", country='" + country + '\'' +
                ", State='" + State + '\'' +
                ", city='" + city + '\'' +
                ", privacy='" + privacy + '\'' +
                '}';
    }
}
