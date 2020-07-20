package com.example.Adapters;

public class ManagmentModel {

    private int managment_img ;
    private String managment_name , managment_task , managment_desc , managment_btn , managment_date ,
    getManagment_datevalu , getManagment_time ;

    public ManagmentModel(int managment_img, String managment_name, String managment_task, String managment_desc, String managment_btn, String managment_date, String getManagment_datevalu, String getManagment_time) {
        this.managment_img = managment_img;
        this.managment_name = managment_name;
        this.managment_task = managment_task;
        this.managment_desc = managment_desc;
        this.managment_btn = managment_btn;
        this.managment_date = managment_date;
        this.getManagment_datevalu = getManagment_datevalu;
        this.getManagment_time = getManagment_time;
    }

    public int getManagment_img() {
        return managment_img;
    }

    public void setManagment_img(int managment_img) {
        this.managment_img = managment_img;
    }

    public String getManagment_name() {
        return managment_name;
    }

    public void setManagment_name(String managment_name) {
        this.managment_name = managment_name;
    }

    public String getManagment_task() {
        return managment_task;
    }

    public void setManagment_task(String managment_task) {
        this.managment_task = managment_task;
    }

    public String getManagment_desc() {
        return managment_desc;
    }

    public void setManagment_desc(String managment_desc) {
        this.managment_desc = managment_desc;
    }

    public String getManagment_btn() {
        return managment_btn;
    }

    public void setManagment_btn(String managment_btn) {
        this.managment_btn = managment_btn;
    }

    public String getManagment_date() {
        return managment_date;
    }

    public void setManagment_date(String managment_date) {
        this.managment_date = managment_date;
    }

    public String getGetManagment_datevalu() {
        return getManagment_datevalu;
    }

    public void setGetManagment_datevalu(String getManagment_datevalu) {
        this.getManagment_datevalu = getManagment_datevalu;
    }

    public String getGetManagment_time() {
        return getManagment_time;
    }

    public void setGetManagment_time(String getManagment_time) {
        this.getManagment_time = getManagment_time;
    }
}
