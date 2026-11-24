package com.atguigu.h_singleton;

public class Test01 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Singleton singleton = Singleton.getSingleton();
            System.out.println(singleton);
        }
    }
}
