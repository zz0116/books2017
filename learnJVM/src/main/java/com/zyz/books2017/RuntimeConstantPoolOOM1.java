package com.zyz.books2017;

/**
 * Created by ZhangYuanzhuo on 2017/2/24.
 */
public class RuntimeConstantPoolOOM1 {
    public static void main(String[] args) {
        String str1 = new StringBuilder("计算机").append("软件").toString();
        System.out.println(str1.intern() == str1);

        /* 不是首次出现 */
        String str2 = new StringBuilder("ja").append("va").toString();
        System.out.println(str2.intern() == str2);
    }
}
