package com.example.android.quakereport;

import java.util.Date;

public class Earthquake {

    private double eMagnitude;
    private String eCity;
    private long eTimeInMilliseconds;
    private String eUrl;


    public Earthquake(double magnitude, String city, long timeInMilliseconds, String url) {
        eMagnitude = magnitude;
        eCity = city;
        eTimeInMilliseconds = timeInMilliseconds;
        eUrl = url;
    }

    public double getMagnitude() {
        return eMagnitude;
    }

    public String getCity() {
        return eCity;
    }

    public long geteTimeInMilliseconds() {
        return eTimeInMilliseconds;
    }

    public String getUrl() {
        return eUrl;
    }
}
