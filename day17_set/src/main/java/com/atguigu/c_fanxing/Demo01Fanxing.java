package com.atguigu.c_fanxing;

import org.junit.Test;

import java.util.ArrayList;

/*
1.概述:是为了统一数据类型的
2.格式:<E>  R  T  K  V
3.注意:
  泛型<>必须写引用类型,如果想操作基本类型,写包装类
  如果<>里面啥也不写,默认类型Object类型

 1.从使用的层面看:可以直接指定一个类型,统一类型,可以防止类型转换异常
2.从定义的层面看:定义的时候不确定将来统一什么类型,此时我们可以定义泛型,等着将来使用的时候再规定和统一类型,代码更灵活

 */
public class Demo01Fanxing {
    @Test
    public void test01(){
        ArrayList<String> list = new ArrayList<>(); //这样就限制了列表的类型就是字符串类型
        //如果不写的话列表就可以添加其它类型的元素
    }

}
