package com.bcil.rxjavaandroid.ui.activity.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.bcil.rxjavaandroid.R;
import com.bcil.rxjavaandroid.ui.activity.model.Android;
import com.bcil.rxjavaandroid.ui.activity.model.Customer;
import com.bcil.rxjavaandroid.ui.activity.utils.Constants;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by NG on 13-Dec-2017.
 */

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder> {

    private List<Customer> mAndroidList;

    public DataAdapter(List<Customer> androidList) {
        mAndroidList = androidList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_row, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Customer customer =  mAndroidList.get(position);
        if(customer.getCustomerid()!=null){
            holder.tvId.setText(customer.getCustomerid());
        }else{
            holder.tvId.setText(Constants.EMPTY);
        }
        if(customer.getCustomername()!=null){
            holder.tvName.setText(customer.getCustomername());
        }else {
            holder.tvName.setText(Constants.EMPTY);
        }

        if(customer.getCustomerbirth()!=null){
            holder.tvBirth.setText(customer.getCustomerbirth());
        }else {
            holder.tvBirth.setText(Constants.EMPTY);
        }

        if(customer.getCustomerage()!=null){
            holder.tvAge.setText(customer.getCustomerage());
        }else {
            holder.tvAge.setText(Constants.EMPTY);
        }


        if(customer.getCustomercity()!=null){
            holder.tvCity.setText(customer.getCustomercity());
        }else {
            holder.tvCity.setText(Constants.EMPTY);
        }


        if(customer.getGraduation()!=null){
            holder.tvGraduate.setText(customer.getGraduation());
        }else {
            holder.tvGraduate.setText(Constants.EMPTY);
        }
        if(customer.getInterschool()!=null){
            holder.tvSchool.setText(customer.getInterschool());
        }else {
            holder.tvSchool.setText(Constants.EMPTY);
        }
        if(customer.getUndergradution()!=null){
            holder.tvUnderGraduate.setText(customer.getUndergradution());
        }else {
            holder.tvUnderGraduate.setText(Constants.EMPTY);
        }
        if(customer.getPostgraduation()!=null){
            holder.tvPostGraduate.setText(customer.getPostgraduation());
        }else {
            holder.tvPostGraduate.setText(Constants.EMPTY);
        }
        if(customer.getEmpdepartment()!=null){
            holder.tvDepartment.setText(customer.getEmpdepartment());
        }else {
            holder.tvDepartment.setText(Constants.EMPTY);
        }
        if(customer.getEmpid()!=null){
            holder.tvEmpId.setText(customer.getEmpid());
        }else {
            holder.tvEmpId.setText(Constants.EMPTY);
        }
        if(customer.getEmpsalary()!=null){
            holder.tvSalary.setText(customer.getEmpsalary());
        }else {
            holder.tvSalary.setText(Constants.EMPTY);
        }
        if(customer.getEmpstatus()!=null){
            holder.tvStatus.setText(customer.getEmpstatus());
        }else {
            holder.tvStatus.setText(Constants.EMPTY);
        }
        if(customer.getEmphobbie()!=null){
            holder.tvHobbie.setText(customer.getEmphobbie());
        }else {
            holder.tvHobbie.setText(Constants.EMPTY);
        }

    }

    @Override
    public int getItemCount() {
        return mAndroidList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private  TextView tvGraduate,tvSchool,tvUnderGraduate,tvPostGraduate,tvDepartment,tvEmpId,tvSalary,tvStatus,tvHobbie;
        private TextView tvId,tvName,tvBirth,tvAge,tvCity;
        public ViewHolder(View view) {
            super(view);

            tvId = (TextView)view.findViewById(R.id.tvId);
            tvName = (TextView)view.findViewById(R.id.tvName);
            tvBirth = (TextView)view.findViewById(R.id.tvBirth);
            tvAge = (TextView)view.findViewById(R.id.tvAge);
            tvCity = (TextView)view.findViewById(R.id.tvCity);

            tvGraduate = (TextView)view.findViewById(R.id.tvGraduate);
            tvSchool = (TextView)view.findViewById(R.id.tvSchool);
            tvUnderGraduate = (TextView)view.findViewById(R.id.tvUnderGraduate);
            tvPostGraduate = (TextView)view.findViewById(R.id.tvPostGraduate);
            tvDepartment = (TextView)view.findViewById(R.id.tvDepartment);

            tvEmpId = (TextView)view.findViewById(R.id.tvEmpId);
            tvSalary = (TextView)view.findViewById(R.id.tvSalary);
            tvStatus = (TextView)view.findViewById(R.id.tvStatus);
            tvHobbie = (TextView)view.findViewById(R.id.tvHobbie);
        }
    }
}
