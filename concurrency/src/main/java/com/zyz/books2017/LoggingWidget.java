package com.zyz.books2017;

/**
 * Created by ZhangYuanzhuo on 2017/2/17.
 */
public class LoggingWidget extends Widget {
	public synchronized void doSomething() {
		System.out.println(toString() + ": calling doSomething");
		super.doSomething();
	}

	public String toString() {
		return null;
	}
}
