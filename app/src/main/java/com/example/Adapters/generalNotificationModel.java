package com.example.Adapters;

public class generalNotificationModel {
    private int  ic_img ;
    private String title , describtion , time ;

    public generalNotificationModel(int ic_img, String title, String describtion, String time) {
        this.ic_img = ic_img;
        this.title = title;
        this.describtion = describtion;
        this.time = time;
    }

    public int getIc_img() {
        return ic_img;
    }

    public void setIc_img(int ic_img) {
        this.ic_img = ic_img;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescribtion() {
        return describtion;
    }

    public void setDescribtion(String describtion) {
        this.describtion = describtion;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
