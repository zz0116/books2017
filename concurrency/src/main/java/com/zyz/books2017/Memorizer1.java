package com.zyz.books2017;

import org.apache.http.annotation.GuardedBy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ZhangYuanzhuo on 2017/3/5.
 */
public class Memorizer1<A, V> implements Computable<A, V> {
    @GuardedBy("this")
    private final Map<A, V> cache = new HashMap<A, V>();
    private final Computable<A, V> c;

    public Memorizer1(Computable<A, V> c) {
        this.c = c;
    }

    @Override
    public synchronized V compute(A arg) throws InterruptedException {
        V result = cache.get(arg);
        if (result == null) {
            result = c.compute(arg);
            cache.put(arg, result);
        }
        return result;
    }
}
