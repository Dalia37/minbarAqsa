package com.example.Adapters;

public class actionModel {


    private String action_name , action_description , action_date ;

    public actionModel( String action_name, String action_description, String action_date) {
        this.action_name = action_name;
        this.action_description = action_description;
        this.action_date = action_date;
    }



    public String getAction_name() {
        return action_name;
    }

    public void setAction_name(String action_name) {
        this.action_name = action_name;
    }

    public String getAction_description() {
        return action_description;
    }

    public void setAction_description(String action_description) {
        this.action_description = action_description;
    }

    public String getAction_date() {
        return action_date;
    }

    public void setAction_date(String action_date) {
        this.action_date = action_date;
    }
}
