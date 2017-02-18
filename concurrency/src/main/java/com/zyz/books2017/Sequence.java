package com.zyz.books2017;

import org.apache.http.annotation.GuardedBy;
import org.apache.http.annotation.ThreadSafe;

/**
 * Created by ZhangYuanzhuo on 2017/2/16.
 */
@ThreadSafe
public class Sequence {
	@GuardedBy("this") private int Value;

	public synchronized int getNext() {
		return Value++;
	}
}
