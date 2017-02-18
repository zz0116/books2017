package com.zyz.books2017;

import org.apache.http.annotation.NotThreadSafe;

/**
 * Created by ZhangYuanzhuo on 2017/2/17.
 */
@NotThreadSafe
public class LazyInitRace {
	private ExpensiveObject instance = null;

	public ExpensiveObject getInstance() {
		if(instance == null) {
			instance = new ExpensiveObject();
		}
		return instance;
	}
}
