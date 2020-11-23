package com.example.androidfinalprojectcoffeeapp;

public class ShopJsonObj {
  private String img;
  private String address;
  private String phonenumber;
  private String Type;
  private String lat;
  private String longitude;
  private boolean isHeartChecked = false;
  
  public String getImg() {
    return img;
  }
  
  public void setImg(String img) {
    this.img = img;
  }
  
  public String getAddress() {
    return address;
  }
  
  public void setAddress(String address) {
    this.address = address;
  }
  
  public String getPhoneNumber() {
    return phonenumber;
  }
  
  public void setPhoneNumber(String phonenumber) {
    this.phonenumber = phonenumber;
  }
  
  public String getType() {
    return Type;
  }
  
  public void setType(String type) {
    Type = type;
  }
  
  public String getLatitude() {
    return lat;
  }
  
  public void setLatitude(String lat) {
    this.lat = lat;
  }
  
  public String getLongitude() {
    return longitude;
  }
  
  public void setLongitude(String longitude) {
    this.longitude = longitude;
  }
  
  public boolean isHeartChecked() {
    return isHeartChecked;
  }
  
  public void setHeartChecked(boolean heartChecked) {
    isHeartChecked = heartChecked;
  }
}