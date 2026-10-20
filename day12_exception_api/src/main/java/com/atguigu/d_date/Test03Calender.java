package com.atguigu.d_date;

import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

public class Test03Calender {
    @Test
    public void test01(){
        Calendar calendar = Calendar.getInstance();

        System.out.println(calendar.get(Calendar.YEAR)); //返回给定日历字段的值

        //void set(int field,int value)  将给定的日历字段设置为指定的值
        calendar.set(Calendar.YEAR,2000);

        //void get(int field) //获取指定的日历字段
        System.out.println(calendar.get(Calendar.YEAR));//2000

        //void add(int field,int amount):根据日历的规则,为给定的日历字段添加或者减去指定的时间量❗❗❗❗注意就记成+正数或者+负数

        calendar.add(Calendar.YEAR,-1);
        System.out.println(calendar.get(Calendar.YEAR)); //1999

        //Date getTime():将Calendar转换为Date对象
        Date date = calendar.getTime();
        System.out.println(date);
        //Sat Oct 16 11:47:35 CST 1999
        System.out.println(calendar);
        System.out.println(calendar.getTime());//将Calender转成Date对象
    }
}
