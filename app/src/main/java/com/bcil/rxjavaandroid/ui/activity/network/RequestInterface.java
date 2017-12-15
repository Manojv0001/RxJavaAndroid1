package com.bcil.rxjavaandroid.ui.activity.network;

import com.bcil.rxjavaandroid.ui.activity.model.Android;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * Created by NG on 13-Dec-2017.
 */

public interface RequestInterface {
    @GET("android/jsonarray/")
    Observable<List<Android>> register();

}
