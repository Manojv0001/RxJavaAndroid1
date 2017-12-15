package com.bcil.rxjavaandroid.ui.activity.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by NG on 14-Dec-2017.
 */

public class Customer {

    private  String customerid;
    private String customername;
    private String customerbirth;
    private String customerage;
    private String customercity;
    private String empid;
    private String empsalary;
    private String empdepartment;
    private String empstatus;
    private String emphobbie;
    private String graduation;
    private String undergradution;
    private String interschool;
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
    public String getCustomerid() {
        return customerid;
    }

    public void setCustomerid(String customerid) {
        this.customerid = customerid;
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername;
    }

    public String getCustomerbirth() {
        return customerbirth;
    }

    public void setCustomerbirth(String customerbirth) {
        this.customerbirth = customerbirth;
    }

    public String getCustomerage() {
        return customerage;
    }

    public void setCustomerage(String customerage) {
        this.customerage = customerage;
    }

    public String getCustomercity() {
        return customercity;
    }

    public void setCustomercity(String customercity) {
        this.customercity = customercity;
    }
}
