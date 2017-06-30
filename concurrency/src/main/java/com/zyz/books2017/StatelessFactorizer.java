package com.zyz.books2017;

import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.math.BigInteger;

/**
 * Created by ZhangYuanzhuo on 2017/2/16.
 */
public class StatelessFactorizer extends GenericServlet implements Servlet {
	@Override
	public void service(ServletRequest req, ServletResponse resp) {
		BigInteger i = extractFromRequest(req);
		BigInteger[] factors = factor(i);
		encodeIntoResponse(resp, factors);
	}

	private void encodeIntoResponse(ServletResponse resp, BigInteger[] factors) {

	}

	private BigInteger[] factor(BigInteger i) {
		return new BigInteger[0];
	}

	private BigInteger extractFromRequest(ServletRequest req) {
		return null;
	}
}
