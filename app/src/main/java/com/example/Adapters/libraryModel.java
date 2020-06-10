package com.example.Adapters;

public class libraryModel {
    private int ic , img;
    private String description , auther , pages ;

    public libraryModel(int ic, int img, String description, String auther, String pages) {
        this.ic = ic;
        this.img = img;
        this.description = description;
        this.auther = auther;
        this.pages = pages;
    }

    public int getIc() {
        return ic;
    }

    public void setIc(int ic) {
        this.ic = ic;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuther() {
        return auther;
    }

    public void setAuther(String auther) {
        this.auther = auther;
    }

    public String getPages() {
        return pages;
    }

    public void setPages(String pages) {
        this.pages = pages;
    }
}
