package com.atguigu.a_string;

import org.junit.Test;
/*
StringBuilder不会产生新的字符串对象，它产生了一个没有被final修饰的字符串数组，不会产生新的对象，节省内存，它使用缓冲区
 */
public class demo03StringBuilder {
    @Test
    public void test1(){
        StringBuilder s1 = new StringBuilder();
        s1.append("hello,world");
        s1.append(",i'm niko");
        System.out.println(s1);//hello,world,i'm niko

        s1.delete(0,1);//删除前两个字符,左闭右开
        System.out.println(s1);//ello,world,i'm niko
    }

    @Test
    public void test2(){
        StringBuilder s1 = new StringBuilder("abc");
        System.out.println(s1);//abc
        s1.append("defg").append("123");//链式调用
        System.out.println(s1);//abcdefg123
        System.out.println(s1.reverse());//321gfedcba

    }


    //回文小案例
    @Test
    public void test03(){
        String s = "上海自来水来自海上";
        //创建StringBuilder对象
        StringBuilder sb = new StringBuilder(s);
        //翻转
        sb.reverse();
        //将StringBuilder转成String
        String s1 = sb.toString();

        if (s.equals(s1)){
            System.out.println("是回文");
        }else{
            System.out.println("不是回文");
        }
    }
}
/*
String,StringBuilder以及StringBuffer区别:

1.相同点:

 三者都可以拼接字符串

2.不同点:

 a.String每拼接一次,都会产生一个新的String对象,占用内存空间,效率低

 b.StringBuilder:拼接的过程中不会随意产生新对象.节省内存空间,线程不安全,效率高

 c.StringBuffer:拼接的过程中不会随意产生新对象,节省内存空间, 线程安全, 效率低

3.从拼接效率上来看: StringBuilder>StringBuffer>String
 */