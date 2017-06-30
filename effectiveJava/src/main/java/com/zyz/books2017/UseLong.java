package com.zyz.books2017;

/**
 * Created by ZhangYuanzhuo on 2017/6/28.
 */
public class UseLong {
    public static void calculate() {
        // 使用Long会构建大概2^31个多余的Long实例, 速度比long慢很多
        // 经测试为10.3倍
        Long sum = 0L;

        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
