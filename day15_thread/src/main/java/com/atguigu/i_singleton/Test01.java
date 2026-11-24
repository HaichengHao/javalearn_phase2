package com.atguigu.i_singleton;

public class Test01 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton singleton = Singleton.getSingleton();
                System.out.println(singleton);
            }
        }).start();
    }
}

