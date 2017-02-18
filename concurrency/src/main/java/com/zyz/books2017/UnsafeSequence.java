package com.zyz.books2017;

import org.apache.http.annotation.NotThreadSafe;

/**
 * Created by ZhangYuanzhuo on 2017/2/16.
 */
@NotThreadSafe
public class UnsafeSequence {
	private int value;

	/* 返回一个唯一的数值。 */
	public int getNext() {
		return value++;
	}
}
