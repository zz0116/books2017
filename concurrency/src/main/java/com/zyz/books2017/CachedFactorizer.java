package com.zyz.books2017;

import org.apache.http.annotation.GuardedBy;

import javax.servlet.*;
import java.io.IOException;
import java.math.BigInteger;

/**
 * Created by ZhangYuanzhuo on 2017/2/17.
 */
public class CachedFactorizer extends GenericServlet implements Servlet {
	@GuardedBy("this") private BigInteger lastNumber;
	@GuardedBy("this") private BigInteger[] lastFactors;
	@GuardedBy("this") private long hits;
	@GuardedBy("this") private long cacheHits;

	public synchronized long getHits() {
		return hits;
	}

	public synchronized double getCacheHitRatio() {
		return (double) cacheHits / (double) hits;
	}

	@Override
	public void service(ServletRequest req, ServletResponse resp) {
		BigInteger i = extractFromRequest(req);
		BigInteger[] factors = null;
		synchronized (this) {
			++hits;
			if (i.equals(lastNumber)) {
				++cacheHits;
				factors = lastFactors.clone();
			}
		}
		if (factors == null) {
			factors = factor(i);
			synchronized (this) {
				lastNumber = i;
				lastFactors = factors.clone();
			}
		}
		encodeIntoResponse(resp, factors);
	}

	private void encodeIntoResponse(ServletResponse resp, BigInteger[] factors) {

	}

	private BigInteger extractFromRequest(ServletRequest req) {
		return null;
	}

	private BigInteger[] factor(BigInteger i) {
		return new BigInteger[0];
	}
}
