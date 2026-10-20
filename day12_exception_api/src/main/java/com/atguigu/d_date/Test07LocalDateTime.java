package com.atguigu.d_date;

import org.junit.Test;

import java.time.LocalDateTime;

public class Test07LocalDateTime {

    @Test
    public void test(){
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);//2026-10-16T16:54:46.553802100
        System.out.println(ldt.getHour());
        System.out.println(ldt.getYear());
        System.out.println(ldt.getDayOfMonth());
        System.out.println(ldt.getDayOfWeek());
        System.out.println(ldt.getDayOfYear());
        /*
        D:\jdk21\bin\java.exe -javaagent:C:\Users\20201\AppData\Local\JetBrains\IntelliJIdea2025.3\captureAgent\debugger-agent.jar=file:///C:/Users/20201/AppData/Local/Temp/capture17044779213826906160.props -ea -Didea.test.cyclic.buffer.size=1048576 "-javaagent:D:\idea2025\IntelliJ IDEA 2025.3.6.1\lib\idea_rt.jar=60336" -Dkotlinx.coroutines.debug.enable.creation.stack.trace=false -Ddebugger.agent.enable.coroutines=true -Dkotlinx.coroutines.debug.enable.flows.stack.trace=true -Dkotlinx.coroutines.debug.enable.mutable.state.flows.stack.trace=true -Ddebugger.async.stack.trace.for.all.threads=true -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "D:\idea2025\IntelliJ IDEA 2025.3.6.1\lib\idea_rt.jar;D:\idea2025\IntelliJ IDEA 2025.3.6.1\plugins\junit\lib\junit6-rt.jar;D:\idea2025\IntelliJ IDEA 2025.3.6.1\plugins\junit\lib\junit5-rt.jar;D:\idea2025\IntelliJ IDEA 2025.3.6.1\plugins\junit\lib\junit-rt.jar;D:\javalearn_phase2\day12_exception_api\target\classes;C:\Users\20201\.m2\repository\cn\hutool\hutool-all\5.8.47\hutool-all-5.8.47.jar;C:\Users\20201\.m2\repository\org\projectlombok\lombok\1.18.48\lombok-1.18.48.jar;C:\Users\20201\.m2\repository\junit\junit\4.13.2\junit-4.13.2.jar;C:\Users\20201\.m2\repository\org\hamcrest\hamcrest-core\1.3\hamcrest-core-1.3.jar" com.intellij.rt.junit.JUnitStarter -ideVersion5 -junit4 com.atguigu.d_date.Test07LocalDateTime,test
        2026-10-16T16:57:57.828334900
        16
        2026
        16
        FRIDAY
        289
         */

        LocalDateTime ldt2 = LocalDateTime.of(2026,1,24,10,10,10);
        System.out.println(ldt2);

    }
}
