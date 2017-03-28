package com.zyz.books2017;

import java.util.concurrent.BlockingQueue;

/**
 * Created by ZhangYuanzhuo on 2017/3/28.
 * 程序清单11-1 对任务队列的串行访问
 */
public class WorkerThread extends Thread {
    private final BlockingQueue<Runnable> queue;

    public WorkerThread(BlockingQueue<Runnable> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Runnable task = queue.take();
                task.run();
            } catch (InterruptedException e) {
                break;
            }
        }
    }
}
