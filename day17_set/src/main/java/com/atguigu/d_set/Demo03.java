package com.atguigu.d_set;

import org.junit.Test;

import java.util.HashSet;

public class Demo03 {
    @Test
    public void test04() {
        //set集合是如何保证元素唯一的
        /*
        set集合存储自定义对象,想要保证元素唯一,自定义对象中需要重写hashCode和equals方法
        让set集合比较对象内容的哈希值以及对象的内容
         */
        HashSet<String> set = new HashSet<>();
        set.add("abc");
        set.add("通话");
        set.add("耕地");
        set.add("abc");

        System.out.println(set);
    }
}
