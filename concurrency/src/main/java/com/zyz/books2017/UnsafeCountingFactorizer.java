package com.zyz.books2017;

import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.math.BigInteger;

/**
 * Created by ZhangYuanzhuo on 2017/2/16.
 */
public class UnsafeCountingFactorizer extends GenericServlet implements Servlet {
	private long count = 0;

	public long getCount() {
		return count;
	}

	@Override
	public void service(ServletRequest req, ServletResponse resp) {
		BigInteger i = extractFromRequest(req);
		BigInteger[] factors = factor(i);
		++count;
		encodeIntoResponse(resp, factors);
	}

	private BigInteger[] factor(BigInteger i) {
		return new BigInteger[0];
	}

	private void encodeIntoResponse(ServletResponse resp, BigInteger[] factors) {

	}

	private BigInteger extractFromRequest(ServletRequest req) {
		return null;
	}
}
