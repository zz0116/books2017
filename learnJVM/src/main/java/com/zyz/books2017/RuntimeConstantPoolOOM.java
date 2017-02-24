package com.zyz.books2017;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ZhangYuanzhuo on 2017/2/24.
 * VM Args: -XX:PermSize=10M -XX:MaxPermSize=10M
 * JDK 1.6及之前的版本才会出现OOM
 */
public class RuntimeConstantPoolOOM {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        int i = 0;
        while (true) {
            list.add(String.valueOf(i++).intern());
        }
    }
}
