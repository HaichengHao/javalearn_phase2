package com.atguigu.d_ticket;

import java.util.TreeMap;

/*
线程安全
发生的场景:多个线程共享同一个资源的时候
 */
public class My_ticket implements Runnable {
    private int ticket_num = 100;

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(100L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (ticket_num > 0){
                System.out.println(Thread.currentThread().getName() + "正在卖第" + ticket_num + "张票");
                ticket_num--;
            }
        }
    }
}
