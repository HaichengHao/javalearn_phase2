package com.atguigu.c_runnable;

public class My_runnable implements Runnable{
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
            System.out.println(Thread.currentThread().getName()+"正在执行"+i);
        }
    }
}
