package com.bcil.rxjavaandroid.ui.activity.model;

import com.google.gson.annotations.SerializedName;

public class WorkInfo{

	@SerializedName("empid")
	private String empid;

	@SerializedName("empsalary")
	private String empsalary;

	@SerializedName("empdepartment")
	private String empdepartment;

	@SerializedName("empstatus")
	private String empstatus;

	@SerializedName("emphobbie")
	private String emphobbie;

	public void setEmpid(String empid){
		this.empid = empid;
	}

	public String getEmpid(){
		return empid;
	}

	public void setEmpsalary(String empsalary){
		this.empsalary = empsalary;
	}

	public String getEmpsalary(){
		return empsalary;
	}

	public void setEmpdepartment(String empdepartment){
		this.empdepartment = empdepartment;
	}

	public String getEmpdepartment(){
		return empdepartment;
	}

	public void setEmpstatus(String empstatus){
		this.empstatus = empstatus;
	}

	public String getEmpstatus(){
		return empstatus;
	}

	public String getEmphobbie() {
		return emphobbie;
	}

	public void setEmphobbie(String emphobbie) {
		this.emphobbie = emphobbie;
	}

	@Override
 	public String toString(){
		return 
			"WorkInfo{" + 
			"empid = '" + empid + '\'' + 
			",empsalary = '" + empsalary + '\'' + 
			",empdepartment = '" + empdepartment + '\'' + 
			",empstatus = '" + empstatus + '\'' +
			",emphobbie = '" + emphobbie + '\'' +
					"}";
		}
}