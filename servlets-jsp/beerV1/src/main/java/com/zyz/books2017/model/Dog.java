package com.zyz.books2017.model;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

/**
 * Created by ZhangYuanzhuo on 2017/2/20.
 */
public class Dog implements HttpSessionBindingListener {
    private String breed;

    public Dog(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public void valueBound(HttpSessionBindingEvent httpSessionBindingEvent) {
        // code to run now that I know I'm in a session
    }

    @Override
    public void valueUnbound(HttpSessionBindingEvent httpSessionBindingEvent) {
        // code to run now that I know I am no longer part of a session
    }
}
