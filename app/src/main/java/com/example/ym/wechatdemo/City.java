package com.example.ym.wechatdemo;

import org.litepal.crud.DataSupport;

/**
 * Created by YM on 2017/3/5.
 */

public class City extends DataSupport{

    private int id;
    private String name;

    public void setCityName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getCityName() {
        return name;
    }
}
