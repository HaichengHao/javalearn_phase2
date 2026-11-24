package com.atguigu.f_list;

import org.junit.Test;

import java.util.ArrayList;

public class Demo01ArrayList {
    @Test
    public void test01(){
        ArrayList<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        System.out.println(list);


        //增
        list.add(1,"赵六");
        System.out.println(list);
        //[张三, 赵六, 李四, 王五]
        //删
        list.remove(1);
        System.out.println(list);
        //[张三, 李四, 王五]

        //删,直接指定删
//        list.remove("李四");

        //设改
        list.set(1,"赵六");
        System.out.println(list);
        //[张三, 赵六, 王五]
        //查
        list.get(2);
        System.out.println(list);
        //[张三, 赵六, 王五]
    }
}
