package com.bcil.rxjavaandroid.ui.activity.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by NG on 13-Dec-2017.
 */

public class Example {

    @SerializedName("postalcodes")
    @Expose
    private List<Postalcode> postalcodes = new ArrayList<>();

    public List<Postalcode> getPostalcodes() {
        return postalcodes;
    }

    public void setPostalcodes(List<Postalcode> postalcodes) {
        this.postalcodes = postalcodes;
    }

}