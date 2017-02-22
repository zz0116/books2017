package com.zyz.books2017;

import org.apache.http.annotation.Immutable;

/**
 * Created by ZhangYuanzhuo on 2017/2/22.
 * 由于Point类似不可变的，因而它是线程安全的。
 * 不可变的值可以被自由地共享与发布，因此在返回location时不需要复制。
 */
@Immutable
public class Point {
    public final int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
