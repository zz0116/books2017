package com.zyz.books2017;

import org.apache.http.annotation.Immutable;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by ZhangYuanzhuo on 2017/2/19.
 */
@Immutable
public final class ThreeStooges {
    private final Set<String> stooges = new HashSet<>();

    public ThreeStooges() {
        stooges.add("Moe");
        stooges.add("Larry");
        stooges.add("Curly");
    }

    public boolean isStooge(String name) {
        return stooges.contains(name);
    }
}
