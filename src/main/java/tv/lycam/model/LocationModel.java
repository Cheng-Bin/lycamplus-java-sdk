package tv.lycam.model;

import java.io.Serializable;

/**
 * Created by lycamandroid on 17/1/19.
 */
public class LocationModel extends PageModel implements Serializable {

    private float lon;
    private float lat;
    private int radius;

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
