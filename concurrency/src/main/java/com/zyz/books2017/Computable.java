package com.zyz.books2017;

/**
 * Created by ZhangYuanzhuo on 2017/3/5.
 */
public interface Computable<A, V> {
    V compute(A arg) throws InterruptedException;
}
