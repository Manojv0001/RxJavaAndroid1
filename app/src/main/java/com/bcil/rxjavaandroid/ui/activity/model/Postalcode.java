package com.bcil.rxjavaandroid.ui.activity.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by NG on 13-Dec-2017.
 */

public class Postalcode {
    @SerializedName("adminCode2")
    @Expose
    private String adminCode2;
    @SerializedName("adminCode3")
    @Expose
    private String adminCode3;
    @SerializedName("adminName3")
    @Expose
    private String adminName3;
    @SerializedName("adminCode1")
    @Expose
    private String adminCode1;
    @SerializedName("adminName2")
    @Expose
    private String adminName2;
    @SerializedName("lng")
    @Expose
    private Double lng;
    @SerializedName("countryCode")
    @Expose
    private String countryCode;
    @SerializedName("postalcode")
    @Expose
    private String postalcode;
    @SerializedName("adminName1")
    @Expose
    private String adminName1;
    @SerializedName("placeName")
    @Expose
    private String placeName;
    @SerializedName("lat")
    @Expose
    private Double lat;

    public String getAdminCode2() {
        return adminCode2;
    }

    public void setAdminCode2(String adminCode2) {
        this.adminCode2 = adminCode2;
    }

    public String getAdminCode3() {
        return adminCode3;
    }

    public void setAdminCode3(String adminCode3) {
        this.adminCode3 = adminCode3;
    }

    public String getAdminName3() {
        return adminName3;
    }

    public void setAdminName3(String adminName3) {
        this.adminName3 = adminName3;
    }

    public String getAdminCode1() {
        return adminCode1;
    }

    public void setAdminCode1(String adminCode1) {
        this.adminCode1 = adminCode1;
    }

    public String getAdminName2() {
        return adminName2;
    }

    public void setAdminName2(String adminName2) {
        this.adminName2 = adminName2;
    }

    public Double getLng() {
        return lng;
    }

    public void setLng(Double lng) {
        this.lng = lng;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode;
    }

    public String getAdminName1() {
        return adminName1;
    }

    public void setAdminName1(String adminName1) {
        this.adminName1 = adminName1;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

}
