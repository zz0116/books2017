package com.zyz.books2017;

import org.apache.http.annotation.GuardedBy;

import javax.servlet.*;
import java.io.IOException;
import java.math.BigInteger;

/**
 * Created by ZhangYuanzhuo on 2017/2/17.
 */
public class SynchronizedFactorizer extends GenericServlet implements Servlet {
	@GuardedBy("this") private BigInteger lastNumber;	// @GuardedBy提示类的维护者有锁
	@GuardedBy("this") private BigInteger[] lastFactors;

	@Override
	public synchronized void service(ServletRequest req, ServletResponse resp) {
		BigInteger i = extractFromRequest(req);
		if (i.equals(lastNumber)) {
			encodeIntoResponse(resp, lastFactors);
		} else {
			BigInteger[] factors = factor(i);
			lastNumber = i;
			lastFactors = factors;
			encodeIntoResponse(resp, factors);
		}
	}	// 虽然解决了线程安全问题，但是性能却极低。称为不良并发

	private BigInteger[] factor(BigInteger i) {
		return new BigInteger[0];
	}

	private void encodeIntoResponse(ServletResponse resp, BigInteger[] lastFactors) {

	}

	private BigInteger extractFromRequest(ServletRequest req) {
		return null;
	}
}
