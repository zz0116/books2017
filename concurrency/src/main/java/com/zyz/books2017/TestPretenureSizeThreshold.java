package com.zyz.books2017;

/**
 * Created by ZhangYuanzhuo on 2017/3/8.
 * 不起作用，PretenureSizeThreshold对Parallel Scavenge无效
 */
public class TestPretenureSizeThreshold {
    public static final int _1MB = 1024 * 1024;

    public static void main(String[] args) {
        byte[] allocation;
        allocation = new byte[4 * _1MB];
    }
}
