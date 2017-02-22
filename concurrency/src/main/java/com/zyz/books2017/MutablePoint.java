package com.zyz.books2017;

import org.apache.http.annotation.NotThreadSafe;

/**
 * Created by ZhangYuanzhuo on 2017/2/22.
 * 程序清单4-5
 * 虽然这个类不是线程安全的，但追踪类是线程安全的。
 */
@NotThreadSafe
public class MutablePoint {
    public int x, y;

    public MutablePoint() {
        x = 0;
        y = 0;
    }

    public MutablePoint(MutablePoint p) {
        this.x = p.x;
        this.y = p.y;
    }
}
