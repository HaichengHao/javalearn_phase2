package com.atguigu.a_stream;

import java.util.function.Predicate;

public class Demo04Predicate {
    public static void main(String[] args) {
        method(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length()==7;
            }
        },"hello"); //判断传入的字符串长度是否等于7

        //lambda
        method(s->s.length()==7,"hello");
    }
    public static void method(Predicate<String> predicate,String s){
        boolean test=predicate.test(s);
        System.out.println(test);
    }
}
