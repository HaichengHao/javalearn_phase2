package com.atguigu.a_exception;


public class Demo09Exception {

    public static void main(String[] args){
        int result=method();
        System.out.println(result);
    }
    public static int method() {
        try {
            String s = null;
            System.out.println(s.length());
            return 2;
        } catch (Exception e) {
            return 1 ;
        } finally {
            System.out.println("我一定会执行的");
        }
    }

}



/*
D:\jdk21\bin\java.exe "-javaagent:D:\idea2025\IntelliJ IDEA 2025.3.6.1\lib\idea_rt.jar=64555" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath D:\javalearn_phase2\day12_exception_api\target\classes com.atguigu.a_exception.Demo09Exception
我一定会执行的
1

输出不符合直觉,按理说应该是先return 1对不?
这就是和python中一样的点,return后即程序结束，所以就是finally先被“让路”

 */