package com.atguigu.d_date;

import org.junit.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

public class Test11DateTimeFormatter {
    @Test
    public void dtf_tst(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime ldt = LocalDateTime.now();
        String time = dtf.format(ldt);

    }

    @Test
    public void test02(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String time = "2026-10-20 12:12:12";
        TemporalAccessor ta = dtf.parse(time);
        //TemporalAccessor是一个接口,常见的实现类:LocalDate,LocalDateTime
        System.out.println(ta);
        //{},ISO resolved to 2026-10-20T12:12:12
        LocalDateTime ldt1 = LocalDateTime.parse(time, dtf);
        System.out.println(ldt1); //2026-10-20T12:12:12
    }
}
