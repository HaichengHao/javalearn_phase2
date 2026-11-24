package com.atguigu.j_lambda;

/*
Lambda表达式使用前提
1.前提:必须是函数式接口做方法参数传递或者返回值返回
2.函数式接口:
  必须有,且只能有一个抽象方法的接口
3.如何快速知道此接口是否是函数式接口:接口上用一个注解
  @FunctionalInterface
 */
@FunctionalInterface
public interface USB {
    void open();
}
