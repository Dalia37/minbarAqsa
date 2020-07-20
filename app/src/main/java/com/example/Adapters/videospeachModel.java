package com.example.Adapters;

public class videospeachModel {
    private int img_textspeach , ic_share , img_post , ic_video ;
    private String tv_name , tv_time , tv_title ;

    public videospeachModel(int img_textspeach, int ic_share, int img_post, int ic_video, String tv_name, String tv_time, String tv_title) {
        this.img_textspeach = img_textspeach;
        this.ic_share = ic_share;
        this.img_post = img_post;
        this.ic_video = ic_video;
        this.tv_name = tv_name;
        this.tv_time = tv_time;
        this.tv_title = tv_title;
    }

    public int getImg_textspeach() {
        return img_textspeach;
    }

    public void setImg_textspeach(int img_textspeach) {
        this.img_textspeach = img_textspeach;
    }

    public int getIc_share() {
        return ic_share;
    }

    public void setIc_share(int ic_share) {
        this.ic_share = ic_share;
    }

    public int getImg_post() {
        return img_post;
    }

    public void setImg_post(int img_post) {
        this.img_post = img_post;
    }

    public int getIc_video() {
        return ic_video;
    }

    public void setIc_video(int ic_video) {
        this.ic_video = ic_video;
    }

    public String getTv_name() {
        return tv_name;
    }

    public void setTv_name(String tv_name) {
        this.tv_name = tv_name;
    }

    public String getTv_time() {
        return tv_time;
    }

    public void setTv_time(String tv_time) {
        this.tv_time = tv_time;
    }

    public String getTv_title() {
        return tv_title;
    }

    public void setTv_title(String tv_title) {
        this.tv_title = tv_title;
    }
}
