package com.zyz.books2017;

import org.apache.http.annotation.GuardedBy;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * Created by ZhangYuanzhuo on 2017/2/24.
 * 程序清单5-6
 * 不要这么做
 */
public class HiddenIterator {
    @GuardedBy("this")
    private final Set<Integer> set = new HashSet<>();

    public synchronized void add(Integer i) {
        set.add(i);
    }

    public synchronized void remove(Integer i) {
        set.remove(i);
    }

    public void addTenThings() {
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            add(r.nextInt());
        }
        System.out.println("DEBUG: added ten elements to " + set);
    }
}
