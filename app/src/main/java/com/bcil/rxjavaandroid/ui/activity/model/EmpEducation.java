package com.bcil.rxjavaandroid.ui.activity.model;

import com.google.gson.annotations.SerializedName;

public class EmpEducation{

	@SerializedName("graduation")
	private String graduation;

	@SerializedName("undergradution")
	private String undergradution;

	@SerializedName("interschool")
	private String interschool;

	@SerializedName("postgraduation")
	private String postgraduation;

	public void setGraduation(String graduation){
		this.graduation = graduation;
	}

	public String getGraduation(){
		return graduation;
	}

	public void setUndergradution(String undergradution){
		this.undergradution = undergradution;
	}

	public String getUndergradution(){
		return undergradution;
	}

	public void setInterschool(String interschool){
		this.interschool = interschool;
	}

	public String getInterschool(){
		return interschool;
	}

	public String getPostgraduation() {
		return postgraduation;
	}

	public void setPostgraduation(String postgraduation) {
		this.postgraduation = postgraduation;
	}

	@Override
 	public String toString(){
		return 
			"EmpEducation{" + 
			"graduation = '" + graduation + '\'' + 
			",undergradution = '" + undergradution + '\'' + 
			",interschool = '" + interschool + '\'' +
			",postgraduation = '" + postgraduation + '\'' +
					"}";
		}
}