package com.atguigu.d_date;

import org.junit.Test;

import java.time.LocalDate;


public class Test08LocalDate {
    @Test
    public void test(){
        LocalDate ld = LocalDate.now();

        //int getYear() ->获取年份
        System.out.println(ld.getYear());

        //int getMonthValue() -> 获取月份
        System.out.println(ld.getMonth());

        //int getDayOfMonth()  ->获取月中的几天
        System.out.println(ld.getDayOfMonth());

    }

    @Test
    public void test02(){
        LocalDate ld1 = LocalDate.now();

        //LocalDate withYear(int year):设置年份
        LocalDate ld2 = ld1.withYear(2027);
        System.out.println(ld2.getYear());

        //localDate withMonth(int month):设置月份
        LocalDate ld3 = ld2.withMonth(3);
        System.out.println(ld3.getMonth());

        //LocalDate WithDayOfMonth(int day):设置月中的天数

        LocalDate ld4 = ld3.withDayOfMonth(12);
        System.out.println(ld4.getDayOfMonth());


        //链式调用
        LocalDate ld5 = ld2.withYear(2026).withMonth(10).withDayOfMonth(19);
        System.out.println(ld5);

        /*
        2027
        MARCH
        12
        2026-10-19
         */
    }

    @Test
    public void test03(){
        LocalDate localDate = LocalDate.of(2026,5,10);
        //向后偏移
        LocalDate localDate1 = localDate.plusYears(1);

        System.out.println(localDate1.getYear());//2027

        //向前偏移
        LocalDate localDate3 = localDate.plusYears(-1);
        System.out.println(localDate3.getYear());//2025
    }

}
