package com.atguigu.d_date;

import org.junit.Test;

import java.time.Duration;
import java.time.LocalDateTime;
/*
计算精确时间
所以用LocalDateTime合适,因为它精确到时分秒
 */

public class Test10Duration {
    @Test
    public void testDuration(){
        LocalDateTime local1 = LocalDateTime.of(2026,10,10,10,10,10);
        LocalDateTime local2 = LocalDateTime.of(2027,10,11,11,10,11);

        Duration d1 = Duration.between(local1,local2);
//        System.out.println(d1.getSeconds());//31626001  单位是秒
        System.out.println(d1.toDays());//366
        System.out.println(d1.toMinutes());//527100
    }
}
