package com.atguigu.d_date;

import org.junit.Test;

import java.util.Date;

public class Test02 {
    @Test
    public void test02(){
        Date date1 = new Date();
        date1.setTime(1000L);
        System.out.println(date1);


        System.out.println("=============");
        Date date2 = new Date();
        System.out.println(date2.getTime());//1792120674634 拿的是当前系统时间的毫秒值


    }
}
