package tv.lycam.model;

import java.io.Serializable;
import java.util.Arrays;

/**
 * Created by chapin on 17/1/19.
 */
public class StreamSearchModel implements Serializable {

    private UserModel user;
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
    private String streamId;
    private String status;
    private StreamURLModel[] streamUrls;
    private String resourceUrl;
    private String streamType;
    private String chatUrl;
    private String chatChannel;
    private String chatToken;
    private String uploadUrl;
    private int videoWidth;
    private int videoHeight;
    private String timeStarted;
    private String timeFinished;

    public UserModel getUser() {
        return user;
    }

    public void setUser(UserModel user) {
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

    public String getStreamId() {
        return streamId;
    }

    public void setStreamId(String streamId) {
        this.streamId = streamId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public StreamURLModel[] getStreamUrls() {
        return streamUrls;
    }

    public void setStreamUrls(StreamURLModel[] streamUrls) {
        this.streamUrls = streamUrls;
    }

    public String getResourceUrl() {
        return resourceUrl;
    }

    public void setResourceUrl(String resourceUrl) {
        this.resourceUrl = resourceUrl;
    }

    public String getStreamType() {
        return streamType;
    }

    public void setStreamType(String streamType) {
        this.streamType = streamType;
    }

    public String getChatUrl() {
        return chatUrl;
    }

    public void setChatUrl(String chatUrl) {
        this.chatUrl = chatUrl;
    }

    public String getChatChannel() {
        return chatChannel;
    }

    public void setChatChannel(String chatChannel) {
        this.chatChannel = chatChannel;
    }

    public String getChatToken() {
        return chatToken;
    }

    public void setChatToken(String chatToken) {
        this.chatToken = chatToken;
    }

    public String getUploadUrl() {
        return uploadUrl;
    }

    public void setUploadUrl(String uploadUrl) {
        this.uploadUrl = uploadUrl;
    }

    public int getVideoWidth() {
        return videoWidth;
    }

    public void setVideoWidth(int videoWidth) {
        this.videoWidth = videoWidth;
    }

    public int getVideoHeight() {
        return videoHeight;
    }

    public void setVideoHeight(int videoHeight) {
        this.videoHeight = videoHeight;
    }

    public String getTimeStarted() {
        return timeStarted;
    }

    public void setTimeStarted(String timeStarted) {
        this.timeStarted = timeStarted;
    }

    public String getTimeFinished() {
        return timeFinished;
    }

    public void setTimeFinished(String timeFinished) {
        this.timeFinished = timeFinished;
    }

    @Override
    public String toString() {
        return "StreamSearchListModel{" +
                "user=" + user +
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
                ", streamId='" + streamId + '\'' +
                ", status='" + status + '\'' +
                ", streamUrls=" + Arrays.toString(streamUrls) +
                ", resourceUrl='" + resourceUrl + '\'' +
                ", streamType='" + streamType + '\'' +
                ", chatUrl='" + chatUrl + '\'' +
                ", chatChannel='" + chatChannel + '\'' +
                ", chatToken='" + chatToken + '\'' +
                ", uploadUrl='" + uploadUrl + '\'' +
                ", videoWidth=" + videoWidth +
                ", videoHeight=" + videoHeight +
                ", timeStarted='" + timeStarted + '\'' +
                ", timeFinished='" + timeFinished + '\'' +
                '}';
    }
}
