package com.zyz.books2017;

/**
 * Created by ZhangYuanzhuo on 2017/3/12.
 */
public class SynAddRunable implements Runnable {
    int a, b;

    public SynAddRunable(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(new SynAddRunable(1, 2)).start();
            new Thread(new SynAddRunable(2, 1)).start();
        }
    }

    @Override
    public void run() {
        synchronized (Integer.valueOf(a)) {
            synchronized (Integer.valueOf(b)) {
                System.out.println(a + b);
            }
        }
    }
}
