package com.example.Adapters;

public class TextspeachModel {
    private int img_textspeach , ic_dawnload ;
    private  String name , time , title , description  ;

    public TextspeachModel(int img_textspeach, int ic_dawnload, String name, String time, String title, String description) {
        this.img_textspeach = img_textspeach;
        this.ic_dawnload = ic_dawnload;
        this.name = name;
        this.time = time;
        this.title = title;
        this.description = description;
    }

    public int getImg_textspeach() {
        return img_textspeach;
    }

    public void setImg_textspeach(int img_textspeach) {
        this.img_textspeach = img_textspeach;
    }

    public int getIc_dawnload() {
        return ic_dawnload;
    }

    public void setIc_dawnload(int ic_dawnload) {
        this.ic_dawnload = ic_dawnload;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
