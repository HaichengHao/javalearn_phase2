package com.atguigu.d_date;

import org.junit.Test;

import java.util.Calendar;
import java.util.Scanner;

public class Test04Calender {
    @Test
    public void test1(){

        /*
        做个小实验
        想看看2000年2月有几天
        大致思路、
        important:
            1. 创建Calendar实例
            2. 设置年份和月份以及日，需要注意的是，月份是从0-11开始的，所以要想设置为3月，那其实对应数字是2
            3. 让实例的日期减去1天，譬如想知道2月有几天那就拿3月减去一天
            4. 利用get方法得到DATE字段，这样就知道对应的月份有几天了
         */
        Calendar cal = Calendar.getInstance();//获取Calendar实例
        //定义一个year代表年份
        int year = 2000;
        //设置年月日
        //注意calender设置的月份比实际月份少一个月，它是从0-11,人类记忆的话是1-12
        cal.set(year,2,1);

        //让day减1，就是2月的最后一天
        cal.add(Calendar.DATE,-1);

        int day = cal.get(Calendar.DATE);
        System.out.println(day);



    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您想查询的年份:");

        int year_demo = sc.nextInt();
        int day_c = getdayof2(year_demo);
        System.out.println("%d年2月有%d天".formatted(year_demo,day_c));

    }

    public static int getdayof2(int year){
        Calendar caln = Calendar.getInstance();
        //拿到实例之后设置年份
        caln.set(year,2,1);
        caln.add(Calendar.DATE,-1);
        int day_count = caln.get(Calendar.DATE);
        return day_count;
    }
}
