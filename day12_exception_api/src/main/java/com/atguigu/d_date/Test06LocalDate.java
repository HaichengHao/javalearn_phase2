package com.atguigu.d_date;

import org.junit.Test;

import java.time.LocalDate;

public class Test06LocalDate {
    @Test
    public void test1(){
        //LocalDate.now() 从默认时区的系统时钟获取当前日期
        LocalDate local1 = LocalDate.now();
        System.out.println(local1);

        //static LocalDate of(int year,int month,int dayofMonth)根据指定的年月日创建LocalDate对象
        LocalDate local2 = LocalDate.of(2026, 1, 24);
        System.out.println(local2);

        /*
        2026-10-16
        2026-01-24
         */



    }
}
