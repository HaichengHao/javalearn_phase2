package com.atguigu.d_date;

import org.junit.Test;

import java.time.LocalDate;
import java.time.Period;

//Period计算日期之间的偏差，主要操作的是年月日偏差
public class Tets09Period {
    @Test
    public void tstPeriod1(){
        LocalDate local1 = LocalDate.of(2023,10,10);
        LocalDate local2 = LocalDate.of(2024,11,11);

        Period period = Period.between(local1,local2); //创建Period对象
        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());
        /*
        1
        1
        1
         */


    }
}
