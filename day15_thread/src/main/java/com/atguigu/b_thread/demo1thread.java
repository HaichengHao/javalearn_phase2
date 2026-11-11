package com.atguigu.b_thread;

public class demo1thread{
    public static void main(String[] args) throws InterruptedException {
        my_thread t1 = new my_thread();

        t1.setName("海燕");//这样可以设置线程名称,这样就变成自己设置的了
        t1.start();
        /*
        使用了getName()之后就能够获取线程的名字
        Thread-0Mythread正在执行0
        Thread-0Mythread正在执行1
        Thread-0Mythread正在执行2
        Thread-0Mythread正在执行3
        Thread-0Mythread正在执行4
         */

        //主线程
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
Thread-0Mythread正在执行0
Thread-0Mythread正在执行1
Thread-0Mythread正在执行2
Thread[#1,main,5,main]Main正在执行0
Thread-0Mythread正在执行3
Thread[#1,main,5,main]Main正在执行1
Thread-0Mythread正在执行4
Thread[#1,main,5,main]Main正在执行2
Thread[#1,main,5,main]Main正在执行3
Thread[#1,main,5,main]Main正在执行4
 */

/*
海燕Mythread正在执行0
海燕Mythread正在执行1
海燕Mythread正在执行2
海燕Mythread正在执行3
海燕Mythread正在执行4
Thread[#1,main,5,main]Main正在执行0
Thread[#1,main,5,main]Main正在执行1
Thread[#1,main,5,main]Main正在执行2
Thread[#1,main,5,main]Main正在执行3
Thread[#1,main,5,main]Main正在执行4
 */