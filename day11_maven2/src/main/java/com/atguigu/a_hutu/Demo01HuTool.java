package com.atguigu.a_hutu;

import cn.hutool.core.util.ArrayUtil;
/*
HuTool里面有很多封装好的面向对象的包,譬如求数组最大最小值等等的操作
不用我们自己再写一遍了
 */
public class Demo01HuTool {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,8};
        System.out.println(ArrayUtil.max(arr));
    }
}
