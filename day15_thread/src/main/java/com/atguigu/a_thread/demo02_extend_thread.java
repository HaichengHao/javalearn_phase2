package com.atguigu.a_thread;
/*
创建多线程有四种方式:

1.继承Thread类

2.实现Runnable接口

3.实现Callable接口

4.线程池
 */
public class demo02_extend_thread {
     /*
     继承Thread类
     1.创建自定义类(自定义线程类)继承Thread
     2.重写Thread类中的run方法,设置线程任务(这个线程需要干啥事儿)
     3.创建自定义线程类的对象
     4.调用Thread类中的start方法(开启线程,jvm自动调用run方法)
      */



     public static void main(String[] args) {
         //创建自定义线程对象
         my_thread t1 = new my_thread();
         //调用start方法开启线程,jvm自动执行run方法->run()
         t1.start();

         for (int i = 0; i < 5; i++) {
             System.out.println("Main正在执行....."+i);
         }

         //抢占式调度:多个线程抢占CPU使用权,哪个线程优先级越高,先抢到CPU使用权的几率就大,但是不是说每次先抢到CPU使用权的都是优先级高的线程,
         // 只是优先级高的线程先抢到CPU使用权的几率会大一些 -> java代码
         /*
        Main正在执行.....0
        Main正在执行.....1
        Main正在执行.....2
        Mythread正在执行0
        Main正在执行.....3
        Main正在执行.....4
        Mythread正在执行1
        Mythread正在执行2
        Mythread正在执行3
        Mythread正在执行4
          */
     }


}
