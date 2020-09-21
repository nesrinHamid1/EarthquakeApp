package com.example.android.earthquake;

/**
 * {@link Earthquake} represents a single Android platform release.
 * Each object has 3 properties: name, version number, and image resource ID.
 */
public class Earthquake {

    private String mMagnitude;


    private String mLocation;


    private String mDate;


    public Earthquake(String magnitude, String location, String date)
    {
        mMagnitude = magnitude;
        mLocation = location;
        mDate = date;

    }

    public String getMagnitude() {
        return mMagnitude;
    }


    public String getLocation() {
        return mLocation;
    }


    public String getDate() {
        return mDate;
    }


}
