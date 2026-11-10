package com.atguigu.d_printstream;

import java.io.PrintStream;

public class demo01_printstream {
    /*
    1.概述:PrintStream extends OutputStream
    2.作用:将数据打印到控制台上或者打印到指定文件中
    3.构造:
      PrintStream(String path)
    4.方法:
      println():原样输出,自带换行效果
      print():原样输出,不带换行效果
     */

    /*
    1.改变流向:System.out.println()这句话会将输出结果打印到控制台上,我们需要让这句话从控制台输出结果转成去日志文件中输出结果
    2.方法:System类中的方法
      System.setOut(PrintStream对象)


     使用场景:
可以将输出的内容以及详细信息放到日志文件中,永久保存
以后我们希望将输出的内容永久保存,但是输出语句会将结果输出到控制台上,控制台是临时显示,
如果有新的程序运行,新程序的运行结果会覆盖之前的结果,这样无法达到永久保存,到时候我们想看看之前的运行结果信息就看不到了
,所以我们需要将输出的结果保存到日志文件中,就可以使用setOut改变流向
     */
    public static void main(String[] args) throws Exception {
//        method0_1();
        method0_2();
    }

    private static void method0_2() throws Exception {
        PrintStream ps = new PrintStream("day14IO/logging.txt");

        //改变流向
        System.setOut(ps);

        System.out.println("出现了一个问题:NULLPointerException");
        System.out.println("问题出现在第十行");
        System.out.println("原因是字符串为null");


    }

    private static void method0_1() throws Exception{
        PrintStream ps = new PrintStream("day14IO/print.txt");
        ps.println("在苍茫的大海上");
        ps.println("狂风~");
        ps.println("卷积着乌云");
        ps.close();
    }




}
