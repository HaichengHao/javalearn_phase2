package com.atguigu.a_string;

import org.junit.Test;

import java.util.Arrays;

public class demo02string {
    @Test
    public void test1(){
        //转换功能，
        //1.toCharArry
        String s1 = "abcd";
        char[] a = s1.toCharArray();
        System.out.println(a);//abcd  输出语句会将

        //2.byte[] getBytes(编码集)根据指定的编码集将字符串转成byte数组
        //不指定就默认按照utf-8
        byte[]  b1 = "好".getBytes();
        System.out.println(Arrays.toString(b1));//[-27, -91, -67],utf-8编码下一个汉字三个字节

        //3 String replace('','') 将指定的字符转化为新的
        String newstr = s1.replace('a','q');
        System.out.println(newstr);//qbcd

    }

    @Test
    public void test2(){
        //统计大小写和数字
        String str="aBcdEfgHIjklMn122212";
        int big=0;
        int small=0;
        int number = 0;
        char[] c1 = str.toCharArray();
        for (char c : c1) {
            if(c>='A' && c<='Z'){
                //在做运算时，char会变成可以进行计算的地址值[ascii码表]
                big++;
            }else if(c>='a'&&c<='z'){
                small++;
            }else if(c>='0'&&c<='9'){//注意要跟字符比而不是直接跟数字比
                number++;
            }
        }
        System.out.println(big);
        System.out.println(small);
        System.out.println(number);
    }

    //分割功能
    @Test
    public void test3(){
        String s = "jahkgf;zg,uiqh.aa";
        String[] splited_str = s.split(",");//指定按照逗号切分，split传的是正则表达式，所以指定按“."是不行的，要用转义"\."才行
        for (String s1 : splited_str) {
            System.out.println("s1="+s1);
        }

    }

    //查看包含关系，大小写等
    @Test
    public void test4(){
        String s="Abc12dEf;., ";
        System.out.println(s.contains("Abc"));

        System.out.println(s.endsWith(","));

        System.out.println(s.startsWith("A"));

        System.out.println(s.toUpperCase());

        System.out.println(s.toLowerCase());

        System.out.println(s.trim()); //去掉字符串两端空格，类似于python中的.trip()
    }
}
