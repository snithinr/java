package com.cvr.mngmt.pojos;

public class Address{
    private String city;
    private String state;
    private String country;
    private int pincode;
    public Address(String city,String state,String country,int pincode) {
    	this.city = city;
    	this.country = country;
    	this.pincode = pincode;
    	this.state = state;
    }
    public void setCity(String city){
        this.city = city;
    }
    public void setState(String state){
        this.state = state;
    }
    public void setCountry(String country){
        this.country = country;
    }
    public void setPincode(int pincode){
        this.pincode = pincode;
    }
    public String getCity(){
        return city;
    }
    public String getState(){
        return state;
    }
    public String getCountry(){
        return country;
    }
    public int pincode(){
        return pincode;
    }
    public String toString(){
        return ("Address : \n"+city+"\n"+state+"\n"+country+"\n"+pincode);
    }
}