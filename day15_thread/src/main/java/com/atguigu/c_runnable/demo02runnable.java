package com.atguigu.c_runnable;

public class demo02runnable {
    public static void main(String[] args) {
        /*
        匿名内部类实现多线程
        属于实现多线程的第二种方式
       匿名内部类：实现接口，同时创建对象
         */
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {

                    System.out.println(Thread.currentThread().getName()+"正在执行"+i);
                }
            }
        },"线程a-").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {

                    System.out.println(Thread.currentThread().getName()+"正在执行"+i);
                }
            }
        },"线程b-").start();
    }
}
/*
线程b-正在执行0
线程b-正在执行1
线程a-正在执行0
线程b-正在执行2
线程a-正在执行1
线程a-正在执行2
线程b-正在执行3
线程a-正在执行3
线程b-正在执行4
线程a-正在执行4

 */