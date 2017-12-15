package com.bcil.rxjavaandroid.ui.activity.model;

import com.google.gson.annotations.SerializedName;

public class JsonArrayItem{

	@SerializedName("EmpEducation")
	private EmpEducation empEducation;

	@SerializedName("CustomerCity")
	private String customerCity;

	@SerializedName("WorkInfo")
	private WorkInfo workInfo;

	@SerializedName("CustomerAge")
	private String customerAge;

	@SerializedName("CustomerId")
	private String customerId;

	@SerializedName("CustomerName")
	private String customerName;

	@SerializedName("CustomerBirth")
	private String customerBirth;

	public void setEmpEducation(EmpEducation empEducation){
		this.empEducation = empEducation;
	}

	public EmpEducation getEmpEducation(){
		return empEducation;
	}

	public void setCustomerCity(String customerCity){
		this.customerCity = customerCity;
	}

	public String getCustomerCity(){
		return customerCity;
	}

	public void setWorkInfo(WorkInfo workInfo){
		this.workInfo = workInfo;
	}

	public WorkInfo getWorkInfo(){
		return workInfo;
	}

	public void setCustomerAge(String customerAge){
		this.customerAge = customerAge;
	}

	public String getCustomerAge(){
		return customerAge;
	}

	public void setCustomerId(String customerId){
		this.customerId = customerId;
	}

	public String getCustomerId(){
		return customerId;
	}

	public void setCustomerName(String customerName){
		this.customerName = customerName;
	}

	public String getCustomerName(){
		return customerName;
	}

	public void setCustomerBirth(String customerBirth){
		this.customerBirth = customerBirth;
	}

	public String getCustomerBirth(){
		return customerBirth;
	}

	@Override
 	public String toString(){
		return 
			"JsonArrayItem{" + 
			"empEducation = '" + empEducation + '\'' + 
			",customerCity = '" + customerCity + '\'' + 
			",workInfo = '" + workInfo + '\'' + 
			",customerAge = '" + customerAge + '\'' + 
			",customerId = '" + customerId + '\'' + 
			",customerName = '" + customerName + '\'' + 
			",customerBirth = '" + customerBirth + '\'' + 
			"}";
		}
}