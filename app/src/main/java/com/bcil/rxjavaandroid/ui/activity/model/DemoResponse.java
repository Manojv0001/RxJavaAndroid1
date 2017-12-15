package com.bcil.rxjavaandroid.ui.activity.model;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.SerializedName;

public class DemoResponse{

	@SerializedName("jsonArray")
	private List<JsonArrayItem> jsonArray = new ArrayList<>();

	public void setJsonArray(List<JsonArrayItem> jsonArray){
		this.jsonArray = jsonArray;
	}

	public List<JsonArrayItem> getJsonArray(){
		return jsonArray;
	}

	@Override
 	public String toString(){
		return 
			"DemoResponse{" + 
			"jsonArray = '" + jsonArray + '\'' + 
			"}";
		}
}