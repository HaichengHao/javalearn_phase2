package com.atguigu.j_lambda;

/*
Lambda表达式使用前提
1.前提:必须是函数式接口做方法参数传递或者返回值返回
2.函数式接口:
  必须有,且只能有一个抽象方法的接口
3.如何快速知道此接口是否是函数式接口:接口上用一个注解
  @FunctionalInterface
 */
public class Demo02Lambda {


    public static void main(String[] args) {

        //由于抽象方法的实现要由集成它的子类来决定，所以这里使用匿名内部类的形式构造了一个匿名的继承自USB类的类，并重写了其open方法
        method(new USB(){
            @Override
            public void open(){
                System.out.println("usb开启");
            }
        });
        System.out.println("===============");


        method(()->{
            System.out.println("usb开启了");
        });
    }

    public static void method(@org.jetbrains.annotations.UnknownNullability USB2 usb){
        usb.open();
    }
}
