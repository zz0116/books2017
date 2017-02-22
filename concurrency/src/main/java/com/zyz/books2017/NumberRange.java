package com.zyz.books2017;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by ZhangYuanzhuo on 2017/2/22.
 * 两个set都是先检查后执行，没有足够的加锁机制保证操作的原子性
 */
public class NumberRange {
    private final AtomicInteger lower = new AtomicInteger(0);
    private final AtomicInteger upper = new AtomicInteger(0);

    public void setLower(int i) {
        if (i > upper.get()) {
            throw new IllegalArgumentException(
                    "can't set lower to " + i + " > upper"
            );
        }
        lower.set(i);
    }

    public void setUpper(int i) {
        if (i < lower.get()) {
            throw new IllegalArgumentException(
                    "can't set upper to " + i + " < lower"
            );
        }
        upper.set(i);
    }

    public boolean isInRange(int i) {
        return (i >= lower.get() && i <= upper.get());
    }
}
