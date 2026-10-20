package com.atguigu.d_date;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
日期格式化类
作用:
    1.可以将Date对象按照指定的格式格式化成一个字符串
    2.还可以将符合指定格式的字符串转回Date对象
创建:
    SimpleDateFormat(String pattern)
        pattern:传递的是我们自己指定的格式
        比如:yyyy-MM-dd HH:mm:ss

方法:
    String format(Date date)将Date对象按照指定的格式转换成字符串
    Date parse(String time) 将符合日期格式的字符串转回Date对象
 */

public class Test05SimpledateFormat {
    @Test
    public void test() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        String time = sdf.format(date); //.format-> Formats a Date into a date-time string.
        System.out.println(time);//2026-10-16 16:04:22

        //使用parse将符合日期格式的字符串转回Date对象
        String time1 = "2026-01-01 12:32:11";
        System.out.println(sdf.parse(time1));


    }

}
