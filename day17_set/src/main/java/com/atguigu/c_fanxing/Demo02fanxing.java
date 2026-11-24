package com.atguigu.c_fanxing;

import org.junit.Test;

import java.util.ArrayList;

/*
1.格式:
  修饰符 <E> 返回值类型 方法名(形参){
      方法体
      return 结果
  }
2.什么时候确定类型:
  调用的时候确定类型
 */
public class Demo02fanxing {
    @Test
    public void test01(){
        ArrayList list = new ArrayList();
        list.add("abc");
        list.add(1);
        list.add(true);
        list.add("haha");
        for(Object o:list){
            String s = (String) o;
            System.out.println(s.length());
        }
    }

    @Test
    public void test02(){
        MyArrayList<String> list1 = new MyArrayList<>();
        list1.add("abc");
        list1.add("haha");
        String element1 = list1.get(0);
        String element2 = list1.get(1);
        System.out.println(element1);
        System.out.println(element2);
    }
}
