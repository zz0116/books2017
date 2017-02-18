package com.zyz.books2017;

import javax.servlet.*;
import java.io.IOException;
import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Created by ZhangYuanzhuo on 2017/2/17.
 */
public class UnsafeCatchingFactorizer extends GenericServlet implements Servlet {
	private final AtomicReference<BigInteger> lastNumber
			= new AtomicReference<>();
	private final AtomicReference<BigInteger[]> lastFactors
			= new AtomicReference<>();

	@Override
	public void service(ServletRequest req, ServletResponse resp) {
		BigInteger i = extractFromRequest(req);				// 从请求得到数字
		if (i.equals(lastNumber.get())) {					// 判断i是否等于缓存里最后一个数
			encodeIntoResponse(resp, lastFactors.get());	// 是：将缓存的因数赋予响应
		} else {											// 不是：设置缓存存入i和i的因数
			BigInteger[] factors = factor(i);
			lastNumber.set(i);
			lastFactors.set(factors);						//两个set无法保证同时更新
			encodeIntoResponse(resp, factors);
		}
	}

	/* 因式分解 */
	private BigInteger[] factor(BigInteger i) {
		return new BigInteger[0];
	}
	/* 处理响应与因数数组 */
	private void encodeIntoResponse(ServletResponse resp, BigInteger[] bigInteger) {

	}
	/* 输入请求，返回数字 */
	private BigInteger extractFromRequest(ServletRequest req) {
		return null;
	}
}
