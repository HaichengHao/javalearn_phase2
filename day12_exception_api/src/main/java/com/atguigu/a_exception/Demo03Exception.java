package com.atguigu.a_exception;

public class Demo03Exception {
    public static void main(String[] args) {
//        String s = "abc.txt";
        String s = "abc.pdf";
        insert(s);

        System.out.println("哈哈哈");

    }

    /*
    用到了String类中的一个方法：
    boolean endwith(String str)
     */
    public static void insert(String s){
        if(!s.endsWith(".txt")){
            throw new NullPointerException();
        }
        System.out.println("呵呵呵");
    }
}

/*
如果改成pdf结尾就是下面这样报错
D:\jdk21\bin\java.exe "-javaagent:D:\idea2025\IntelliJ IDEA 2025.3.6.1\lib\idea_rt.jar=55941" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath D:\javalearn_phase2\day12_exception_api\target\classes com.atguigu.a_exception.Demo03Exception
Exception in thread "main" java.lang.NullPointerException
	at com.atguigu.a_exception.Demo03Exception.insert(Demo03Exception.java:18)
	at com.atguigu.a_exception.Demo03Exception.main(Demo03Exception.java:6)
 */
