package com.bcil.rxjavaandroid.ui.activity.network;

import com.bcil.rxjavaandroid.ui.activity.model.DemoResponse;
import com.bcil.rxjavaandroid.ui.activity.utils.Constants;
import com.squareup.okhttp.OkHttpClient;

import java.util.List;
import java.util.concurrent.TimeUnit;

import okhttp3.MediaType;
import okhttp3.RequestBody;
//import projects.aakash.com.demoapplication.Activity.Models.User;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

/**
 * Created by NG on 21-07-2017.
 */

public class ApiClientMain {
    private static DemoApiInterface DemoApiInterface;  // interface for Retrofit api
    public static final String prefixUrl = "v0/b/fir-storage-861db.appspot.com/o/";
    private static StringBuilder builder = new StringBuilder();
    public static final String URL = builder.append(Constants.URL).append(prefixUrl).toString();
    public static final String MEDIA_TYPE_STRING = "text/plain";
    public static final String MEDIA_TYPE_IMAGE = "image/*";

    public static DemoApiInterface getApiClient() {

        if (DemoApiInterface == null) {
            OkHttpClient client = new OkHttpClient();
            client.setConnectTimeout(20, TimeUnit.SECONDS);
            client.setReadTimeout(15, TimeUnit.SECONDS);
            client.setWriteTimeout(15, TimeUnit.SECONDS);
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

            DemoApiInterface = retrofit.create(DemoApiInterface.class);
        }
        return DemoApiInterface;
    }

    public interface DemoApiInterface {
        /*@FormUrlEncoded
        @POST("Servelet")
        Call<User> pushData(@Field("Name") String name,
                            @Field("Email") String email,
                            @Field("Address") String mobile);*/
    /*    @GET("android/jsonarray/")
        Call<List<Android>> register();*/
        @GET("uploads%2FNewDemo.json?alt=media&token=b9c8e5ce-98b4-4f17-926c-aea63150acce")
        Call<DemoResponse> register();
    }

    public static RequestBody getStringRequestBody(String s) {
        return RequestBody.create(MediaType.parse(MEDIA_TYPE_STRING), s);
    }
}
