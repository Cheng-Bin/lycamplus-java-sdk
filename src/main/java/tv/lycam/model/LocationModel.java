package tv.lycam.model;

import tv.lycam.enumeration.Order;
import tv.lycam.enumeration.Sort;

import java.io.Serializable;

/**
 * Created by lycamandroid on 17/1/19.
 */
public class LocationModel extends PageModel implements Serializable {

    private float lon;
    private float lat;
    private int radius;

    public LocationModel() {}

    public LocationModel(float lon, float lat, int radius) {
        this.lon = lon;
        this.lat = lat;
        this.radius = radius;
    }

    public LocationModel(int resultsPerPage, int pageNumber, Sort sort, Order order, float lon, float lat, int radius) {
        super(resultsPerPage, pageNumber, sort, order);
        this.lon = lon;
        this.lat = lat;
        this.radius = radius;
    }

    public float getLon() {
        return lon;
    }

    public void setLon(float lon) {
        this.lon = lon;
    }

    public float getLat() {
        return lat;
    }

    public void setLat(float lat) {
        this.lat = lat;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
