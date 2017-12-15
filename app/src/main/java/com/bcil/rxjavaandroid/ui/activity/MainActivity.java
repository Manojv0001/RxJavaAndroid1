package com.bcil.rxjavaandroid.ui.activity;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.bcil.rxjavaandroid.R;
import com.bcil.rxjavaandroid.ui.activity.adapter.DataAdapter;
import com.bcil.rxjavaandroid.ui.activity.model.Customer;
import com.bcil.rxjavaandroid.ui.activity.model.DemoResponse;
import com.bcil.rxjavaandroid.ui.activity.model.JsonArrayItem;
import com.bcil.rxjavaandroid.ui.activity.network.ApiClientMain;
import com.bcil.rxjavaandroid.ui.activity.network.CityService;
import com.bcil.rxjavaandroid.ui.activity.utils.Constants;
import com.google.gson.Gson;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.reactivestreams.Subscription;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.disposables.CompositeDisposable;
import retrofit2.Call;
import retrofit2.Response;

/*import rx.Observable;
import rx.Observer;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Func1;
import rx.schedulers.Schedulers;*/

public class MainActivity extends AppCompatActivity {

    private Subscription subscription;
    private TextView mOutputTextView;
    private CityService mCityService;
    public static final String BASE_URL = "https://api.learn2crack.com/";

    private RecyclerView mRecyclerView;

    private CompositeDisposable mCompositeDisposable;

    private DataAdapter mAdapter;

    private List<Customer> mAndroidArrayList = new ArrayList<>();;
    private ProgressDialog progress;
    /*final String strJson = "{ "Android" :[{"song_name":"Gimme Dat",
            "song_id":"1932",
            "artist_name":"Sidney Samson (Feat. Pitbull & Akon)},"

        "{ "song_name":"F-k The Money (Remix)",
        "song_id":"73",
        "artist_name":"B.o.B. (Feat. Wiz Khalifa)"}"] }";*/
        final String strJson = "{ \"jsonArray\" :[\n" +
            "{\n" +
            "\"CustomerId\":\"1\",\n" +
            "\"CustomerName\":\"abc\",\n" +
            "\"CustomerBirth\":\"xx-xx-xxxx\",\n" +
            "\"CustomerAge\":\"22\",\n" +
            "\"CustomerCity\":\"Mumbai\"\n" +
            "},\n" +
            "{\n" +
            "\"CustomerId\":\"2\",\n" +
            "\"CustomerName\":\"abcdef\",\n" +
            "\"CustomerBirth\":\"xx-xx-xxxx\",\n" +
            "\"CustomerAge\":\"22\"\n" +
            "},\n" +
            "{\n" +
            "\"CustomerId\":\"2\",\n" +
            "\"CustomerName\":\"abcdef\",\n" +
            "\"CustomerAge\":\"22\"\n" +
            "},{\n" +
            "\"CustomerId\":\"2\",\n" +
            "\"CustomerName\":\"abcdef\",\n" +
            "\"CustomerAge\":\"22\",\n" +
            "\"CustomerCity\":\"Pune\"\n" +
            "}\n" +
            "]\n" +
            "}";
        List<Customer> customerList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        progress = new ProgressDialog(MainActivity.this);
        mCompositeDisposable = new CompositeDisposable();
        initView();
        initData();
    }

    private void initData() {
      /*  RequestInterface requestInterface = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build().create(RequestInterface.class);

        mCompositeDisposable.add(requestInterface.register()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(this::handleResponse,this::handleError));*/

      callWebservice();
//        parseJSON();
        bindDataToRecyclerView();
    }

    private void bindDataToRecyclerView() {

    }

    private void parseJSON() {
        try {
            JSONObject jsonObject = new JSONObject(strJson);
            JSONArray jsonArray = jsonObject.getJSONArray("jsonArray");
            for(int i=0;i<jsonArray.length();i++){
                JSONObject jsonObject1 = jsonArray.getJSONObject(i);
                String customerid = (String) jsonObject1.get("CustomerId");
                String customername = (String) jsonObject1.get("CustomerName");
                String customerBirth =  jsonObject1.optString("CustomerBirth");
                String customerAge = jsonObject1.optString("CustomerAge");
                String customerCity =  jsonObject1.optString("CustomerCity");
                Customer customer = new Customer();
                customer.setCustomerid(customerid);
                customer.setCustomername(customername);
                if(customerBirth!=null&& !TextUtils.isEmpty(customerBirth)){
                    customer.setCustomerbirth(customerBirth);
                }
                if(customerAge!=null&& !TextUtils.isEmpty(customerAge)){
                    customer.setCustomerage(customerAge);
                }
                if(customerCity!=null&& !TextUtils.isEmpty(customerCity)){
                    customer.setCustomercity(customerCity);
                }
                customerList.add(customer);
            }
//            customerList.size();
        } catch (JSONException e) {
            e.printStackTrace();
        }

    }

    private void callWebservice() {
        Log.d(MainActivity.class.getSimpleName(),"CheckJsonFormat:"+strJson);
        progress.setIndeterminate(true);
        progress.setMessage("Please wait...");
        progress.show();
        Call<DemoResponse> call= ApiClientMain.getApiClient().register();
        call.enqueue(new retrofit2.Callback<DemoResponse>() {
            @Override
            public void onResponse(Call<DemoResponse> call, Response<DemoResponse> response) {
                if (progress.isShowing())
                    progress.dismiss();
                DemoResponse resp = response.body();
                if (resp != null) {
                    List<JsonArrayItem> jsonArrayItemList = resp.getJsonArray();

                    for(int i=0;i<jsonArrayItemList.size();i++){
                        String jsonResponse = new Gson().toJson(jsonArrayItemList.get(i));
                        Log.d(MainActivity.class.getSimpleName(),"Checkresponse:"+jsonResponse);
                        try {
                            JSONObject jsonObject = new JSONObject(jsonResponse);
//                        JSONArray jsonArray = jsonObject.getJSONArray("jsonArray");
//                        for(int i=0;i<jsonArray.length();i++){
//                            JSONObject jsonObject1 = jsonArray.getJSONObject(i);
                            String customerage = jsonObject.optString("CustomerAge");
                            String customerbirth = jsonObject.optString("CustomerBirth");
                            String customercity = jsonObject.optString("CustomerCity");
                            String customerid = jsonObject.getString("CustomerId");
                            String customername = jsonObject.getString("CustomerName");



                            JSONObject jsonObject2 = jsonObject.getJSONObject("EmpEducation");
                            String graduation = jsonObject2.optString("graduation");
                            String interschool = jsonObject2.optString("interschool");
                            String undergraduate = jsonObject2 .optString("undergradution");
                            String postgraduate = jsonObject2 .optString("postgraduation");
                            JSONObject jsonObject3 = jsonObject.getJSONObject("WorkInfo");
                            String empdepartment = jsonObject3.optString("empdepartment");
                            String empid = jsonObject3.optString("empid");
                            String empsalary = jsonObject3.optString("empsalary");
                            String empstatus = jsonObject3.optString("empstatus");
                            String emphobbie = jsonObject3.optString("emphobbie");
                            Customer customer = new Customer();
                            if(customerid!=null){
                                customer.setCustomerid(customerid);
                            }else{
                                customer.setCustomerid(Constants.EMPTY);
                            }

                            if(customername!=null){
                                customer.setCustomername(customername);
                            }else{
                                customer.setCustomername(Constants.EMPTY);
                            }

                            if(customerbirth!=null){
                                customer.setCustomerbirth(customerbirth);
                            }else{
                                customer.setCustomerbirth(Constants.EMPTY);

                            }

                            if(customerage!=null){
                                customer.setCustomerage(customerage);
                            }else{
                                customer.setCustomerage(Constants.EMPTY);
                            }

                            if(customercity!=null){
                                customer.setCustomercity(customercity);
                            }else{
                                customer.setCustomercity(Constants.EMPTY);
                            }

                            if(graduation!=null){
                                customer.setGraduation(graduation);
                            }else{
                                customer.setGraduation(Constants.EMPTY);
                            }
                            if(interschool!=null){
                                customer.setInterschool(interschool);
                            }else{
                                customer.setInterschool(Constants.EMPTY);
                            }

                            if(undergraduate!=null){
                                customer.setUndergradution(undergraduate);
                            }else{
                                customer.setUndergradution(Constants.EMPTY);
                            }

                            if(postgraduate!=null){
                                customer.setPostgraduation(postgraduate);
                            }else {
                                customer.setPostgraduation(Constants.EMPTY);
                            }

                            if(empdepartment!=null){
                                customer.setEmpdepartment(empdepartment);
                            }else {
                                customer.setEmpdepartment(Constants.EMPTY);
                            }

                            if(empid!=null){
                                customer.setEmpid(empid);
                            }else {
                                customer.setEmpid(Constants.EMPTY);
                            }

                            if(empsalary!=null){
                                customer.setEmpsalary(empsalary);
                            }else {
                                customer.setEmpsalary(Constants.EMPTY);
                            }

                            if(empstatus!=null){
                                customer.setEmpstatus(empstatus);
                            }else {
                                customer.setEmpstatus(Constants.EMPTY);
                            }

                            if(emphobbie!=null){
                                customer.setEmphobbie(emphobbie);
                            }else {
                                customer.setEmphobbie(Constants.EMPTY);
                            }
                            customerList.add(customer);
//                        }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                    mAdapter = new DataAdapter(customerList);
                    mRecyclerView.setAdapter(mAdapter);
//                    mAndroidArrayList = new ArrayList<>(resp);
                    /*mAdapter = new DataAdapter(mAndroidArrayList);
                    mRecyclerView.setAdapter(mAdapter);*/
                }
            }

            @Override
            public void onFailure(Call<DemoResponse> call, Throwable t) {
                if (progress.isShowing())
                    progress.dismiss();
                Toast.makeText(MainActivity.this, "Please try again", Toast.LENGTH_SHORT).show();
            }
        });
    }

    /*private void handleResponse(List<Android> androidList) {

        mAndroidArrayList = new ArrayList<>(androidList);
        mAdapter = new DataAdapter(mAndroidArrayList);
        mRecyclerView.setAdapter(mAdapter);
    }*/

    /*private void handleError(Throwable error) {

        Toast.makeText(this, "Error "+error.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
    }*/





    private void initView() {
        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        mRecyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        mRecyclerView.setLayoutManager(layoutManager);

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
//        mCompositeDisposable.clear();
//        subscription.unsubscribe();
    }
}
