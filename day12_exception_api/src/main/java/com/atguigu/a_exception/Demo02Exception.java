package com.atguigu.a_exception;

import java.io.FileOutputStream;

public class Demo02Exception {

    public static void main(String[] args) {

        //运行时期异常
        int[] arr = {1,2,3,4,5};
        System.out.println(arr[100]);

        //运行后就会报错提示IndexOutofBounds

    }

    public static void method(int[] arr){
        System.out.println(arr[10]);
    }
}
