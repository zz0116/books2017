package com.zyz.books2017;

import org.apache.http.annotation.NotThreadSafe;

/**
 * Created by ZhangYuanzhuo on 2017/2/18.
 */
@NotThreadSafe
public class MutableInteger {
    private int value;

    public int get() {
        return value;
    }

    public void set(int value) {
        this.value = value;
    }
}
