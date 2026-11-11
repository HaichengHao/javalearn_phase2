package com.atguigu.b_thread;
/*
void run()  :设置线程任务,这个线程能干啥
void start()  : 使该线程开始执行；Java 虚拟机调用该线程的 run 方法
void setName(String name)  : 给线程设置名字
String getName() : 获取线程名字
static Thread currentThread()  : 获取当前正在执行的线程对象-> 这个方法在哪个线程中用,就获取的是哪个线程对象
static void sleep(long millis) :线程睡眠,设置的是毫秒值,超时之后线程会自动醒来,继续执行
 */
public class my_thread extends Thread{
    @Override
    public void run(){
        for (int i = 0; i < 5; i++) {
            /*
            问题:
            为啥run方法中有编译时期异常只能try,不能throws?
            原因: Thread类中的run没有抛异常,所以我们重写之后就不能抛,只能try
             */
            try {
                Thread.sleep(2000L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(getName()+"Mythread正在执行"+i);
        }
    }
}
