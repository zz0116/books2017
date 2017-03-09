package com.zyz.books2017.model;

/**
 * Created by ZhangYuanzhuo on 2017/3/9.
 */
public abstract class Person {
    private String name;
    private Cat cat;

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
