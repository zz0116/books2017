package com.zyz.books2017;

import org.junit.Before;
import org.junit.Test;

import java.math.BigInteger;
import java.util.List;

import static java.util.concurrent.TimeUnit.SECONDS;

/**
 * Created by ZhangYuanzhuo on 2017/3/12.
 */
public class PrimeGeneratorTest {
    PrimeGenerator pg;

    @Before
    public void setUp() throws Exception {
        pg = new PrimeGenerator();
    }

    @Test
    public void aSecondOfPrimes() throws Exception {
        new Thread(pg).start();
        try {
//            List<BigInteger> list = pg.get();
//            System.out.println(list);
            SECONDS.sleep(1);   //启动pg，pg运行1秒后停止
            List<BigInteger> list = pg.get();
            System.out.println(list);
        } finally {
            pg.cancel();        //不管1秒后有没有停止，取消pg
        }
        List<BigInteger> list = pg.get();
        System.out.println(list);
    }
}