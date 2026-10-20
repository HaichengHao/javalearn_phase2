package com.atguigu.a_exception;

import java.io.FileOutputStream;

public class Demo01Exception {

    public static void main(String[] args) {
//        method();  //搞一个递归，造出错误
        //编译时期异常
//        FileOutputStream fos= new FileOutputStream("day12_exception_api/1.txt");

        //运行时期异常
        int[] arr = new int[10];
        System.out.println(arr[100]);

        //运行后就会报错提示IndexOutofBounds

    }

    public static void method(){
        method();
    }
}
