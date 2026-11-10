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
        System.out.println(time);
        /*
        D:\jdk21\bin\java.exe -javaagent:C:\Users\20201\AppData\Local\JetBrains\IntelliJIdea2025.3\captureAgent\debugger-agent.jar=file:///C:/Users/20201/AppData/Local/Temp/capture5548655693163485571.props -ea -Didea.test.cyclic.buffer.size=1048576 "-javaagent:D:\idea2025\IntelliJ IDEA 2025.3.6.1\lib\idea_rt.jar=64299" -Dkotlinx.coroutines.debug.enable.creation.stack.trace=false -Ddebugger.agent.enable.coroutines=true -Dkotlinx.coroutines.debug.enable.flows.stack.trace=true -Dkotlinx.coroutines.debug.enable.mutable.state.flows.stack.trace=true -Ddebugger.async.stack.trace.for.all.threads=true -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "D:\idea2025\IntelliJ IDEA 2025.3.6.1\lib\idea_rt.jar;D:\idea2025\IntelliJ IDEA 2025.3.6.1\plugins\junit\lib\junit6-rt.jar;D:\idea2025\IntelliJ IDEA 2025.3.6.1\plugins\junit\lib\junit5-rt.jar;D:\idea2025\IntelliJ IDEA 2025.3.6.1\plugins\junit\lib\junit-rt.jar;D:\javalearn_phase2\day12_exception_api\target\classes;C:\Users\20201\.m2\repository\cn\hutool\hutool-all\5.8.47\hutool-all-5.8.47.jar;C:\Users\20201\.m2\repository\org\projectlombok\lombok\1.18.48\lombok-1.18.48.jar;C:\Users\20201\.m2\repository\junit\junit\4.13.2\junit-4.13.2.jar;C:\Users\20201\.m2\repository\org\hamcrest\hamcrest-core\1.3\hamcrest-core-1.3.jar" com.intellij.rt.junit.JUnitStarter -ideVersion5 -junit4 com.atguigu.d_date.Test11DateTimeFormatter
        {},ISO resolved to 2026-10-20T12:12:12
        2026-10-20T12:12:12
        2026-10-20 22:43:16
         */
    }

    @Test
    public void test02(){

        //tips:创建datetimeformatter对象并创建对应的时间字符串
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String time = "2026-10-20 12:12:12";

        //方法1
        TemporalAccessor ta = dtf.parse(time);
        //TemporalAccessor是一个接口,常见的实现类:LocalDate,LocalDateTime
        System.out.println(ta);
        //{},ISO resolved to 2026-10-20T12:12:12

        //important:不如直接下面这个
        LocalDateTime ldt1 = LocalDateTime.parse(time, dtf);
        System.out.println(ldt1); //2026-10-20T12:12:12
    }
}
