package com.example.android.quakereport;

/**
 * Created by ilafedoseev on 04/07/2017.
 */

public class Earthquake {
    private double mMagnitube;
    private String mLocation;
    private long timeInMillisecond;
    private String mUrl;

    public Earthquake(double mMagnitube, String mLocation, long timeInMilliseconds, String mUrl) {
        this.mMagnitube = mMagnitube;
        this.mLocation = mLocation;
        this.timeInMillisecond = timeInMilliseconds;
        this.mUrl = mUrl;
    }



    //setters
    public void setmMagnitube(double mMagnitube) {
        this.mMagnitube = mMagnitube;
    }

    public void setmLocation(String mLocation) {
        this.mLocation = mLocation;
    }

    public void setTimeInMillisecond(long timeInMillisecond) {
        this.timeInMillisecond = timeInMillisecond;
    }

    public void setmUrl(String mUrl) {
        this.mUrl = mUrl;
    }

    //getters
    public double getmMagnitube() {
        return mMagnitube;
    }

    public String getmLocation() {
        return mLocation;
    }

    public long getTimeInMillisecond() {
        return timeInMillisecond;
    }

    public String getmUrl() {
        return mUrl;
    }
}
