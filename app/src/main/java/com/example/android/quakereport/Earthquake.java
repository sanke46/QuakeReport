package com.example.android.quakereport;

/**
 * Created by ilafedoseev on 04/07/2017.
 */

public class Earthquake {
    private String mMagnitube;
    private String mLocation;
    private String mDate;

    public Earthquake(String mMagnitube, String mLocation, String mDate) {
        this.mMagnitube = mMagnitube;
        this.mLocation = mLocation;
        this.mDate = mDate;
    }

    //setters
    public void setmMagnitube(String mMagnitube) {
        this.mMagnitube = mMagnitube;
    }

    public void setmLocation(String mLocation) {
        this.mLocation = mLocation;
    }

    public void setmDate(String mDate) {
        this.mDate = mDate;
    }

    //getters
    public String getmMagnitube() {
        return mMagnitube;
    }

    public String getmLocation() {
        return mLocation;
    }

    public String getmDate() {
        return mDate;
    }
}
