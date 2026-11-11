package com.atguigu.c_runnable;
/*
方式2，实现Runnable接口
1.创建自定义线程类,实现Runnable接口
2.重写run方法,设置线程任务
3.利用Thread类中的构造方法:
  Thread(Runnable r)
  Thread(Runnable r,String name)可以设置线程名字
4.调用Thread类中的start方法开启线程
 */

/*
1.继承Thread方式:继承支持单继承,不能多继承,有局限性
2.实现Runnable接口方式:接口可以多继承,多实现,还可以一个类继承一个父类的同时实现一个或者多个接口,局限性小
 */
public class demo01runnable {
    public static void main(String[] args) throws InterruptedException {
        My_runnable myrunnable = new My_runnable();
        //创建Thread对象,传递Myrunnable，创建线程对象最终都需要依靠Thread
        Thread t1 = new Thread(myrunnable);
        t1.start();
        for (int i = 0; i < 5; i++) {
            //主线程其实也是可以利用getName()获取名字的
            //但是不能直接使用,因为要想使用得继承Thread才行,可是这里又不能继承
            //那么就得使用这个
            //static Thread currentThread()  : 获取当前正在执行的线程对象-> 这个方法在哪个线程中用,就获取的是哪个线程对象
            Thread.sleep(2000L);
            System.out.println(Thread.currentThread()+"Main正在执行"+i);
        }
    }
}
/*
Thread-0正在执行0
Thread[#1,main,5,main]Main正在执行0
Thread[#1,main,5,main]Main正在执行1
Thread-0正在执行1
Thread[#1,main,5,main]Main正在执行2
Thread-0正在执行2
Thread-0正在执行3
Thread[#1,main,5,main]Main正在执行3
Thread[#1,main,5,main]Main正在执行4
Thread-0正在执行4

 */