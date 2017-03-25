package com.zyz.books2017;

/**
 * Created by ZhangYuanzhuo on 2017/3/25.
 * 简单的锁顺序死锁
 */
public class LeftRightDeadlock {
    private final Object left = new Object();
    private final Object right = new Object();

    public void leftRight() {
        synchronized (left) {
            synchronized (right) {
                doSomething();
            }
        }
    }

    private void doSomething() {
    }

    public void rightLeft() {
        synchronized (right) {
            synchronized (left) {
                doSomethingElse();
            }
        }
    }

    private void doSomethingElse() {
    }
}
