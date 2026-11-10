package com.atguigu.a_string;

import org.junit.Test;

public class demo01string {
    @Test
    public void test1(){
        String s = "abc";
        boolean b = s.equals("abc");
        System.out.println("b= "+b);
//        boolean equalIgnoreCase(String str) 判断内容是否一样，忽略大小写
        boolean result = "abc".equalsIgnoreCase("aBC");
        System.out.println("result="+result);


    }

    @Test
    public void test2(){
        String s ="abc";
        s=null;//如果是null就会有安全隐患，会出现空指针

        //下面这种写法遇到空指针就会有问题
//        if(s.equals("abc")){
//            System.out.println("是abc");
//        }else {
//            System.out.println("不是abc");
//        }
    }



    //获取
    @Test
    public void test3(){
        String str = "abcdefg";
        String newS1 = str.concat("haha"); //拼接
        System.out.println(newS1);//abcdefghaha


        char c1 = str.charAt(0); //获取指定索引位置的字符
        System.out.println(c1);//a

        int i1 = str.indexOf("e");
        System.out.println(i1); //4

    }

    @Test
    public void test4(){
        String s1 = "abcedfghijklmn";
        String newstr2 = s1.substring(2,4);//含头不含尾
        System.out.println(newstr2);//ce


        int len = s1.length();
        System.out.println(len);//14
    }



    @Test
    public void test5(){
        String s1 = "abcedfghijklmn";

        //遍历字符串,拿到所有字符
        for(char c:s1.toCharArray()){
            System.out.print(c);
        }

        //方式2
        for(int i=0;i<s1.length();i++){
            System.out.println(s1.charAt(i));
        }
    }


}
