package com.bcil.rxjavaandroid.ui.activity.network;

import com.bcil.rxjavaandroid.ui.activity.model.CityResponse;
import com.bcil.rxjavaandroid.ui.activity.model.Example;

import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by NG on 13-Dec-2017.
 */

public interface CityService {
    @GET("postalCodeLookupJSON")
    Single<Example> queryGeonames(@Query("postalcode") String postalcode, @Query("country") String country,@Query("username") String username);
}
