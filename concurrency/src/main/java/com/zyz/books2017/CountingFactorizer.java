package com.zyz.books2017;

import javax.servlet.*;
import java.io.IOException;
import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by ZhangYuanzhuo on 2017/2/17.
 */
public class CountingFactorizer extends GenericServlet implements Servlet {
	private final AtomicLong count = new AtomicLong(0);

	public long getCount() {
		return count.get();
	}

	@Override
	public void service(ServletRequest req, ServletResponse resp) {
		BigInteger i = extractFromRequest(req);
		BigInteger[] factors = factor(i);
		count.incrementAndGet();
		encodingIntoResponse(resp, factors);
	}

	private void encodingIntoResponse(ServletResponse resp, BigInteger[] factors) {

	}

	private BigInteger[] factor(BigInteger i) {
		return new BigInteger[0];
	}

	private BigInteger extractFromRequest(ServletRequest req) {
		return null;
	}
}
