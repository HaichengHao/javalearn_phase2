package com.atguigu.c_junit;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Demo1 {

    //静态不能直接访问非静态，想访问还得新建对象
//    public static void main(String[] args) {
//        Demo1 demo1 = new Demo1();
//        demo1.method1();
//    }

    //junit来了，我们可以很方便执行测试要用的代码


    //important:
    // @Test 修饰的方法不能传参
    // @Test修饰的方法不能有返回值
    // @Test修饰的方法不能是静态的
    @Test  //用这个就直接等同于上面的main测试功能了
    public void method1(){
        System.out.println("method1 has been invoked");
    }
    /*
    D:\jdk21\bin\java.exe -javaagent:C:\Users\20201\AppData\Local\JetBrains\IntelliJIdea2025.3\captureAgent\debugger-agent.jar=file:///C:/Users/20201/AppData/Local/Temp/capture9443071103517716837.props -ea -Didea.test.cyclic.buffer.size=1048576 "-javaagent:D:\idea2025\IntelliJ IDEA 2025.3.6.1\lib\idea_rt.jar=51740" -Dkotlinx.coroutines.debug.enable.creation.stack.trace=false -Ddebugger.agent.enable.coroutines=true -Dkotlinx.coroutines.debug.enable.flows.stack.trace=true -Dkotlinx.coroutines.debug.enable.mutable.state.flows.stack.trace=true -Ddebugger.async.stack.trace.for.all.threads=true -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\20201\.m2\repository\org\junit\platform\junit-platform-launcher\6.1.3\junit-platform-launcher-6.1.3.jar;C:\Users\20201\.m2\repository\org\junit\vintage\junit-vintage-engine\6.1.3\junit-vintage-engine-6.1.3.jar;D:\idea2025\IntelliJ IDEA 2025.3.6.1\lib\idea_rt.jar;D:\idea2025\IntelliJ IDEA 2025.3.6.1\plugins\junit\lib\junit6-rt.jar;D:\idea2025\IntelliJ IDEA 2025.3.6.1\plugins\junit\lib\junit5-rt.jar;D:\idea2025\IntelliJ IDEA 2025.3.6.1\plugins\junit\lib\junit-rt.jar;D:\javalearn_phase2\day11_maven2\target\classes;C:\Users\20201\.m2\repository\cn\hutool\hutool-all\5.8.47\hutool-all-5.8.47.jar;C:\Users\20201\.m2\repository\org\projectlombok\lombok\1.18.48\lombok-1.18.48.jar;C:\Users\20201\.m2\repository\junit\junit\4.13.2\junit-4.13.2.jar;C:\Users\20201\.m2\repository\org\hamcrest\hamcrest-core\1.3\hamcrest-core-1.3.jar;C:\Users\20201\.m2\repository\org\junit\jupiter\junit-jupiter\6.1.3\junit-jupiter-6.1.3.jar;C:\Users\20201\.m2\repository\org\junit\jupiter\junit-jupiter-api\6.1.3\junit-jupiter-api-6.1.3.jar;C:\Users\20201\.m2\repository\org\opentest4j\opentest4j\1.3.0\opentest4j-1.3.0.jar;C:\Users\20201\.m2\repository\org\junit\platform\junit-platform-commons\6.1.3\junit-platform-commons-6.1.3.jar;C:\Users\20201\.m2\repository\org\apiguardian\apiguardian-api\1.1.2\apiguardian-api-1.1.2.jar;C:\Users\20201\.m2\repository\org\jspecify\jspecify\1.0.0\jspecify-1.0.0.jar;C:\Users\20201\.m2\repository\org\junit\jupiter\junit-jupiter-params\6.1.3\junit-jupiter-params-6.1.3.jar;C:\Users\20201\.m2\repository\org\junit\jupiter\junit-jupiter-engine\6.1.3\junit-jupiter-engine-6.1.3.jar;C:\Users\20201\.m2\repository\org\junit\platform\junit-platform-engine\6.1.3\junit-platform-engine-6.1.3.jar" com.intellij.rt.junit.JUnitStarter -ideVersion5 -junit6 com.atguigu.c_junit.Demo1
    method1 has been invoked

    Process finished with exit code 0
     */


    @Test
    public void method2(){
        System.out.println("method2 has been invoked");
    }

    /*
    1.@Before:在@Test之前执行,有多少个@Test一起执行@Before修饰的方法就执行几次 -> 可以用于初始化数据
    2.@After:在@Test之后执行,有多少个@Test一起执行@After修饰的方法就执行几次  -> 可以用于释放资源
     */
    @Before
    public void before(){
        System.out.println("before");
    }

    @After
    public void after(){
        System.out.println("after");
    }


    /*
    before
    method1 has been invoked
    after
    before
    method2 has been invoked
    after
     */


}
