package com.zyz.books2017;

import org.apache.http.annotation.ThreadSafe;

import javax.servlet.*;
import java.io.IOException;
import java.math.BigInteger;

/**
 * Created by ZhangYuanzhuo on 2017/3/5.
 */
@ThreadSafe
public class Factorizer extends GenericServlet implements Servlet {
    private final Computable<BigInteger, BigInteger[]> c =
            new Computable<BigInteger, BigInteger[]>() {
                @Override
                public BigInteger[] compute(BigInteger arg) {
                    return factor(arg);
                }
            };
    private final Computable<BigInteger, BigInteger[]> cache =
            new Memorizer<>(c);

    private BigInteger[] factor(BigInteger arg) {
        return new BigInteger[0];
    }

    @Override
    public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
        try {
            BigInteger i = extractFromRequest(req);
            encodeIntoResponse(resp, cache.compute(i));
        } catch (InterruptedException e) {
            encodeError(resp, "factorization interrupted");
        }
    }

    private void encodeError(ServletResponse resp, String s) {

    }

    private void encodeIntoResponse(ServletResponse resp, BigInteger[] compute) {

    }

    private BigInteger extractFromRequest(ServletRequest req) {
        return null;
    }
}
