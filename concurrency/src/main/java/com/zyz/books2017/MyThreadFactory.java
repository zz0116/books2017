package com.zyz.books2017;

import java.util.concurrent.ThreadFactory;

/**
 * Created by ZhangYuanzhuo on 2017/3/25.
 */
public class MyThreadFactory implements ThreadFactory {
    private final String poolName;

    public MyThreadFactory(String poolName) {
        this.poolName = poolName;
    }

    @Override
    public Thread newThread(Runnable r) {
        return new MyAppThread(r, poolName);
    }
}
