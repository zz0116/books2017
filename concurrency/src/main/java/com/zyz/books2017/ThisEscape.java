package com.zyz.books2017;

import java.awt.*;
import java.util.EventListener;

/**
 * Created by ZhangYuanzhuo on 2017/2/18.
 */
public class ThisEscape {
    public ThisEscape(EventSource source) {
        source.registerListener(
                new EventListener() {
                    public void onEvent(Event e) {
                        doSomething(e);
                    }
                }
        );
    }

    private void doSomething(Event e) {

    }
}
