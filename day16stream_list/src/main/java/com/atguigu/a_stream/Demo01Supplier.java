package com.atguigu.a_stream;

import java.util.Arrays;
import java.util.function.Supplier;

public class Demo01Supplier {
    public static void main(String[] args) {
        //Supplier是函数式接口，所以传对象的时候可以用匿名内部类去传递
        method(new Supplier<Integer>() {
            @Override
            public Integer get() {
                int[] arr = {5,3,78,6,1};
                Arrays.sort(arr);//默认升序排序
                return arr[arr.length-1];//拿到最大值
            }
        });

        method(()->{
            int[] arr = {5,3,78,6,1};
            Arrays.sort(arr);//默认升序排序
            return arr[arr.length-1];//拿到最大值
        });
    }

    public static void method(Supplier<Integer> supplier){
        System.out.println(supplier.get());
    }
}
