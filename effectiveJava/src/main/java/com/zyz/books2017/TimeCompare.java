package com.zyz.books2017;

import org.slf4j.profiler.StopWatch;

import java.util.Scanner;

/**
 * Created by ZhangYuanzhuo on 2017/6/29.
 */
public class TimeCompare {
    public static double time(String name) {
        StopWatch timer = new StopWatch(name);  //算法P160
        if (name.equals("UseLong")) UseLong.calculate();
        if (name.equals("LongTolong")) LongTolong.calculate();
        timer.stop();
        return timer.elapsedTime();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please input your first and second args:");
        String arg1 = in.next();
        String arg2 = in.next();
        System.out.println("Calculating...");

        double t1 = TimeCompare.time(arg1);
        double t2 = TimeCompare.time(arg2);

        System.out.printf("%s is %.1f faster than %s%n", arg1,  t2 / t1, arg2);
    }
}
