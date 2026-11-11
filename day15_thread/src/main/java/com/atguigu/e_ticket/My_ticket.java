package com.atguigu.e_ticket;

/*
线程安全
发生的场景:多个线程共享同一个资源的时候

解决线程安全问题的第一种方式(使用同步代码块)
1.同步代码块:
  synchronized(任意对象){
      线程不安全的代码
  }
2.任意对象:就是锁对象
3.执行流程:
  线程先抢到锁的话,才能进入到同步代码块中执行,其他线程等待,等着线程出了同步代码块自动将锁释放,其他线程才能抢锁,抢到了执行,抢不到继续等待
 */
public class My_ticket implements Runnable {
    private int ticket_num = 100;

    Object obj = new Object();
    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(100L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (obj){
                if (ticket_num > 0){
                    System.out.println(Thread.currentThread().getName() + "正在卖第" + ticket_num + "张票");
                    ticket_num--;
                }
            }

        }
    }
}
