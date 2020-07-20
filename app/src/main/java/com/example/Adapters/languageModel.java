package com.example.Adapters;

public class languageModel {
    private int ic_flag ;
    private String language ;

    public languageModel(int ic_flag, String language) {
        this.ic_flag = ic_flag;
        this.language = language;
    }

    public int getIc_flag() {
        return ic_flag;
    }

    public void setIc_flag(int ic_flag) {
        this.ic_flag = ic_flag;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
