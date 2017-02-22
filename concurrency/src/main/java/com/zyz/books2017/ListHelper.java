package com.zyz.books2017;

import org.apache.http.annotation.NotThreadSafe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by ZhangYuanzhuo on 2017/2/22.
 * 程序清单4-14
 * 不要这么做
 */
@NotThreadSafe
public class ListHelper<E> {
    public List<E> list =
            Collections.synchronizedList(new ArrayList<E>());

    /*
    * 在错误的锁上进行同步，putIfAbsent的锁和链表的锁不同，
    * 所以不是原子的
    * */
//    public synchronized boolean putIfAbsent(E x) {
//        boolean absent = !list.contains(x);
//        if (absent) {
//            list.add(x);
//        }
//        return absent;
//    }

    public boolean putIfAbsent(E x) {
        synchronized (list) {
            boolean absent = !list.contains(x);
            if (absent) {
                list.add(x);
            }
            return absent;
        }
    }
}
