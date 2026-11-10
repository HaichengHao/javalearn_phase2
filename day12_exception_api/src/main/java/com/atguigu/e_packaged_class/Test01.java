package com.atguigu.e_packaged_class;

import org.junit.Test;

import java.util.ArrayList;

public class Test01 {
    /*
    包装类就是基本类型对应的那个类
    为什么要使用包装类:
        当我们调用方法的时候，人家方法的形参或者返回值类型都要求使用包装类，所以我们就需要将基本类型转成包装类去返回
        去传参而且包装类里面有很多的方法可以去操作我们的数据
    Byte    byte
    Short   short
    Integer int
    Long    long
    Float   float
    Double  double
    Boolean boolean
    Character   char



     */



    @Test
    public void test1(){
        Integer i1 = new Integer(1);  //只是有报错提示,其实并不影响执行，但是过时了
        System.out.println(i1);

        //用valueOf方法创建Integer对象
        Integer i2 = Integer.valueOf(2);
        System.out.println(i2);
    }

    //拆箱和装箱
    @Test

    public void test2(){
        //int -> Integer
        Integer i4 = Integer.valueOf(10); //装箱，其实之后使用的都是自动的
        System.out.println(i4);
        //要知道，对象之间是无法加减乘除的,因为现在是装箱了，想要加减乘除，就要把Integer转换为int

        //而这样的操作，就叫拆箱
        int i = i4.intValue();//这样就拆出来了
        System.out.println(i+1);


        //String -> int
        int i3 = Integer.parseInt("10");//拆箱
        System.out.println(i3);//10



    }

    @Test
    public void test3(){
        //自动装箱,把一个基本类型复制给包装类,不报错
        Integer i5 = 10; //自动装箱
        System.out.println(i5);


        i5+=10; //自动拆箱,让包装类转为基本类型并且进行数学运算
        System.out.println(i5);
    }


    @Test
    public void test4(){
        Integer i1 = 100;
        Integer i2 = 100;
        System.out.println(i1==i2);


        Integer i3 = 200;
        Integer i4 = 200;
        System.out.println(i3==i4);
    }
    /*
    true
    false

    这是为什么？因为包装类有缓冲区
    Integer 是-128-127,所以在区间内的会命中缓存，不重复赋值

     */
}
