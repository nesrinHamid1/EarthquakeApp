package com.example.android.earthquake;

/**
 * {@link Earthquake} represents a single Android platform release.
 * Each object has 3 properties: name, version number, and image resource ID.
 */
public class Earthquake {

    private String mMagnitude;


    private String mLocation;


    private long  mTimeInMilliseconds;


    public Earthquake(String magnitude, String location, long timeInMilliseconds)
    {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;

    }

    public String getMagnitude() {
        return mMagnitude;
    }


    public String getLocation() {
        return mLocation;
    }


    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }


}
