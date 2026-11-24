package com.atguigu.c_fanxing;

import java.util.Arrays;

public class MyArrayList <E>{
    //定义一个数组
    private Object[] arr = new Object[10];

    //定义一个长度
    private int size = 0;

    //定义一个add方法
    public void add(E e){
        arr[size] =e;
        size++;
    }


    /*
    定义get方法用于根据索引获取元素
    @param index
    @return
     */
    public E get(int index){
        return (E) arr[index];
    }

    public String toString(){
        return Arrays.toString(arr);
    }
}
