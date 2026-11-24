package com.atguigu.a_stream;

import java.util.function.Consumer;

public class Demo2Consumer {
    public static void main(String[] args) {
        method(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s.length());
            }
        },"abcdefg");

        //lambda写法
        method((s)->{
            System.out.println(s.length());
        },"abcdefg");

        //lambda再精简
        method(s-> System.out.println(s.length()),"abcdefg");
    }
    public static void method(Consumer<String> consumer, String s){
        consumer.accept(s);
    }
}
