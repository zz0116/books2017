package com.zyz.books2017;

import java.awt.*;
import java.util.EventListener;

/**
 * Created by ZhangYuanzhuo on 2017/2/18.
 */
public class SafeListener {
    private final EventListener listener;

    private SafeListener() {
        listener = new EventListener() {
            public void onEvent(Event e) {
                doSomething(e);
            }
        };
    }

    public static SafeListener newInstance(EventSource source) {
        SafeListener safe = new SafeListener();
        source.registerListener(safe.listener);
        return safe;
    }

    private void doSomething(Event e) {

    }
}
