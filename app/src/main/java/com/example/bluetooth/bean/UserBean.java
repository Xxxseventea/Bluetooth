package com.example.bluetooth.bean;

public class UserBean {


    private String name; //表单文件的请求参数
    private Integer period; //类型 比如img/jpg

    public Integer getPeriod() {
        return period;
    }

    public void setPeriod(Integer period) {
        this.period = period;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }
}
