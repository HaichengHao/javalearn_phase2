package com.atguigu.d_date;

import org.junit.Test;

import java.util.Date;

public class Test01 {

    @Test
    public  void test01(){
        Date date1 = new Date();
        System.out.println(date1);


        System.out.println("===========");
        Date date2 = new Date(1000L);//根据指定时间来创建Date对象->传递毫秒值->时间从时间原点开始算起
        System.out.println(date2);

        /*
        Fri Oct 16 11:00:33 CST 2026
        ===========
        Thu Jan 01 08:00:01 CST 1970

         */

    }
}
