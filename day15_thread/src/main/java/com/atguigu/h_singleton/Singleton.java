package com.atguigu.h_singleton;
/*
单例模式,不让外界new对象
这就需要构造私有化
 */
public class Singleton {

    private Singleton(){
     /*
    饿汉式:我好饿呀,我很急需一个对象
    所以:饿汉式需要赶紧让对象new出来,而且将其变成静态的,让这个对象随着类的加载而直接创建
     */

    }

    /*
     * 由于是饿汉式,迫不及待的想要对象创建出来
     * 所以我们需要将对象变成静态的
     *
     * 为了不让外界直接用类名调用对象,我们需要将其变成私有的
     */

    private static Singleton singleton = new Singleton();

    /*
     对外提供公共的接口,将内部的对象给外界使用
     */

    public static Singleton getSingleton(){
        return singleton;
    }

}
