package com.atguigu.a_list;

import org.junit.Test;

import java.util.ArrayList;

public class Demo01Array_list {
    @Test
    public void test01(){
        ArrayList<String> list = new ArrayList<>();
        //空参构造创建对象
        list.add("hello");

    }

    //踩坑点
    @Test
    public void test02(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);

        //如果使用remove方法，它会识别为索引序号,这样会报错
        list.remove(2);

        //所以需要将int型实参装箱
        //这样才是真正删除掉了制定的2
        list.remove(Integer.valueOf(2));
    }
}
