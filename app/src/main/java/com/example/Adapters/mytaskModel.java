package com.example.Adapters;

public class mytaskModel {
    private  String taskdate , tasktype, taskdescription ;
    private  String excute;

    public mytaskModel(String taskdate, String tasktype, String taskdescription, String excute) {
        this.taskdate = taskdate;
        this.tasktype = tasktype;
        this.taskdescription = taskdescription;
        this.excute = excute;
    }

    public String getTaskdate() {
        return taskdate;
    }

    public void setTaskdate(String taskdate) {
        this.taskdate = taskdate;
    }

    public String getTasktype() {
        return tasktype;
    }

    public void setTasktype(String tasktype) {
        this.tasktype = tasktype;
    }

    public String getTaskdescription() {
        return taskdescription;
    }

    public void setTaskdescription(String taskdescription) {
        this.taskdescription = taskdescription;
    }

    public String getExcute() {
        return excute;
    }

    public void setExcute(String excute) {
        this.excute = excute;
    }
}
