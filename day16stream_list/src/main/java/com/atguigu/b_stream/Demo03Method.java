package com.atguigu.b_stream;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class Demo03Method {
    public static void main(String[] args) {
        method(new Supplier<String>() {
            @Override
            public String get() {
                return " abcdefg ".trim() ;
            }
        });

        method("abcdefg"::trim);
    }
    public static void method(Supplier<String> supplier){
        String result = supplier.get();
        System.out.println(result);
    }
}
