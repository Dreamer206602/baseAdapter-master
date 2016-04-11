package com.zhy.sample.bean;

/**
 * Created by boobooL on 2016/4/11 0011
 * Created 邮箱 ：boobooMX@163.com
 */
public class User {
    private String name;
    private String url;

    public User(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
