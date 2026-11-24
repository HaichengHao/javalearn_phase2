package com.atguigu.i_singleton;

//懒汉模式
//1.概述:不需要提前new对象,等到啥时候用的时候,啥时候new出来给我,当然还需要保证这个类只产生一个对象
public class Singleton {
    private Singleton(){

    }

    private static Singleton singleton = null;
    public static Singleton getSingleton(){
        if(singleton == null) {
            synchronized (Singleton.class) {

                    singleton = new Singleton();

            }
        }
        return singleton;
    }
}
