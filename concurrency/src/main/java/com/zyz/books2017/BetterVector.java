package com.zyz.books2017;

import org.apache.http.annotation.ThreadSafe;

import java.util.Vector;

/**
 * Created by ZhangYuanzhuo on 2017/2/22.
 */
@ThreadSafe
public class BetterVector<E> extends Vector<E> {
    public synchronized boolean putIfAbsent(E x) {
        boolean absent = !contains(x);
        if (absent) {
            add(x);
        }
        return absent;
    }
}
