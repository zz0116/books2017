package com.zyz.books2017;

/**
 * Created by ZhangYuanzhuo on 2017/6/28.
 */
public class LongTolong {
    public static void calculate() {
        long sum = 0L;

        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
