package com.zyz.books2017;

import java.math.BigInteger;

/**
 * Created by ZhangYuanzhuo on 2017/3/5.
 */
public class ExpensiveFunction implements Computable<String, BigInteger> {
    @Override
    public BigInteger compute(String arg) throws InterruptedException {
        return new BigInteger(arg);
    }
}
