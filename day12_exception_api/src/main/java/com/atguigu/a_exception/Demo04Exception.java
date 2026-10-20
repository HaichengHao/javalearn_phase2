package com.atguigu.a_exception;

import java.io.FileNotFoundException;

public class Demo04Exception {
    public static void main(String[] args) throws FileNotFoundException {
//        String s = "abc.txt";
        String s = "abc.pdf";
        insert(s);

        //这样无脑加throws的后果就是，如果你有多个功能实现，但是一个功能异常，其它功能就也不能执行
        //所以这样写是不够好的,所以还是要使用try..catch
        System.out.println("功能1");
        System.out.println("功能2");
        System.out.println("功能3");


    }


    public static void insert(String s) throws FileNotFoundException {
        if(!s.endsWith(".txt")){
            throw new FileNotFoundException("文件未找到");
        }
        System.out.println("呵呵呵");
    }
}

