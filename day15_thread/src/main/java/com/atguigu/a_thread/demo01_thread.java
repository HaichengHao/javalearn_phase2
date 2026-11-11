package com.atguigu.a_thread;

public class demo01_thread {
    //专门为main方法服务的线程就叫主线程
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("我爱多线程"+i);
        }

        System.out.println("O(∩_∩)O哈哈~");
    }
}
