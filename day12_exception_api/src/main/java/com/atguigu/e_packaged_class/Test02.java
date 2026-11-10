package com.atguigu.e_packaged_class;

import org.junit.Test;
/*
基本类型和String之间的转换
 */

public class Test02 {

    @Test
    public void test01(){
        //每一个包装类都有一个类似的方法:parsexxx()
        System.out.println(Integer.parseInt("10"));//这样就把字符串10转化成了Integer


    }
}
