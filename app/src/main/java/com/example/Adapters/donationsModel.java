package com.example.Adapters;

public class donationsModel {
    private  int donations_img ;
    private  String donations_tv;

    public donationsModel(int donations_img, String donations_tv) {
        this.donations_img = donations_img;
        this.donations_tv = donations_tv;
    }

    public int getDonations_img() {
        return donations_img;
    }

    public void setDonations_img(int donations_img) {
        this.donations_img = donations_img;
    }

    public String getDonations_tv() {
        return donations_tv;
    }

    public void setDonations_tv(String donations_tv) {
        this.donations_tv = donations_tv;
    }
}
