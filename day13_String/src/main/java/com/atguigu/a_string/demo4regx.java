package com.atguigu.a_string;

import org.junit.Test;

public class demo4regx {
    @Test
    public void test1(){
        //和python中的一致的概念,主要也是和python一样负责字符串校验
        String s1 = "天空好像下雨，我好想住你隔壁";
        System.out.println(s1.matches("天.*?"));//true

        String s2 = "Abce123";
        System.out.println(s2.matches("[a-zA-Z]+\\d{3}$"));//true

    }


    @Test
    public void phonenumtest(){
        String phonenum = "18867899678";
        System.out.println(phonenum.matches("^1[358]\\d{9}$"));
    }


    //量词
    /*
    * 0或多
    + 1或多
    ？ 0或1
     */


    @Test
    public void test2(){
        String s1 = "abcabcabc";
        //匹配abc组合多次
        System.out.println(s1.matches("(abc)+"));//true
    }

    /*
    匹配空格\s



     */
    @Test
    public void test3(){
        String s2 ="abc haha";
        System.out.println(s2.matches("[a-z]+\\s+[a-z]+"));//true

        System.out.println(s2.replaceAll("\\s",","));//abc,haha
    }


}
