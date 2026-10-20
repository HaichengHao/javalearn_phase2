package com.atguigu.a_exception;

import java.io.FileNotFoundException;


public class Demo06Exception {
    public static void main(String[] args) {
//        String s = "abc.txt";
        String s = "abc.pdf";

        try {
            insert(s);
        } catch (FileNotFoundException e) {
//            e.printStackTrace(); //打印详细的异常信息
            System.out.println(e.getMessage());
        }



        System.out.println("功能1");
        System.out.println("功能2");
        System.out.println("功能3");


    }


    public static void insert(String s) throws FileNotFoundException {
        if(!s.endsWith(".txt")){
            throw new FileNotFoundException("文件未找到❗ ");
        }
        System.out.println("呵呵呵");
    }
}

/*
这样的话就算文件未找到异常抛出，其它的也不会受到影响
D:\jdk21\bin\java.exe "-javaagent:D:\idea2025\IntelliJ IDEA 2025.3.6.1\lib\idea_rt.jar=49670" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath D:\javalearn_phase2\day12_exception_api\target\classes com.atguigu.a_exception.Demo06Exception
java.io.FileNotFoundException: 文件未找到
	at com.atguigu.a_exception.Demo06Exception.insert(Demo06Exception.java:30)
	at com.atguigu.a_exception.Demo06Exception.main(Demo06Exception.java:12)
功能1
功能2
功能3
 */

