package com.atguigu.a_stream;

import java.util.function.Function;

public class Demo03Function {
    public static void main(String[] args) {
        method03(new Function<Integer, String>() {
            @Override
            public String apply(Integer integer) {
                    return integer+"";
            }
        },100);

        //lambda写法
        method03((Integer integer)-> {
            return integer + "";
        },100);
        //最简化
        method03(integer -> integer+"",1000);
    }
    public static void method03(Function<Integer,String> function,int a){
        String s = function.apply(a);
        System.out.println(s+1);

    }
}
