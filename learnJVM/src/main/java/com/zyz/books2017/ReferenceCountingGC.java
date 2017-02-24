package com.zyz.books2017;

/**
 * Created by ZhangYuanzhuo on 2017/2/24.
 * -XX:+PrintGCDetails 输出GC日志
 */
public class ReferenceCountingGC {
    private static final int _1MB = 1024 * 1024;
    public Object instance = null;
    private byte[] bigSize = new byte[2 * _1MB];

    public static void main(String[] args) {
        ReferenceCountingGC objA = new ReferenceCountingGC();
        ReferenceCountingGC objB = new ReferenceCountingGC();
        objA.instance = objB;
        objB.instance = objA;

        objA = null;
        objB = null;

        System.gc();
    }
}
