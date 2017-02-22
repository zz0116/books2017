package com.zyz.books2017;

import org.apache.http.annotation.GuardedBy;

/**
 * Created by ZhangYuanzhuo on 2017/2/22.
 * 程序清单4-3
 */
public class PrivateLock {
    private final Object myLock = new Object();
    @GuardedBy("myLock")
    Widget widget;

    void someMethod() {
        synchronized (myLock) {
            // 访问或修改Widget的状态
        }
    }
}
