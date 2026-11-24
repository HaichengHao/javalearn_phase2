package com.atguigu.f_list;

import org.junit.Test;

import java.util.ArrayList;

public class Demo2_Enhancedforloop {
    @Test
    public void test01(){
        ArrayList<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");

        //增强for: 集合名.for
        /*
        底层原理是迭代器
        for(元素类型 元素名 : 集合名 ){
            循环体
        }
         */

        for (String s : list) {
            System.out.println(s);
        }
    }
}
