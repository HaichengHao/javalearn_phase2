package com.atguigu.b_charstream;
/*
1.概述:字符输出流 -> Writer(抽象类) -> 子类:FileWriter
2.作用:写数据
3.构造:
  FileWriter(File file)
  FileWriter(String path)
  FileWriter(String path,boolean append) 如果append是true,就是续写追加
4.方法:
  write(int c) 一次写一个字符
  write(char[] cbuf) 一次写一个字符数组
  write(char[] cbuf, int off, int len)一次写一个字符数组一部分
  write(String str) 一次写一个字符串
  close()关闭资源
  flush()刷新缓冲区,将缓冲区中的数据刷到文件中
  1.flush():将缓冲区中的数据刷到文件中,后续流对象还能用
  2.close():先刷新,后关闭,后续流对象不能使用了
5.注意:
  字符输出流底层有一个缓冲区,我们需要将我们要写的内容从缓冲区中刷到文件中
 */

import java.io.FileWriter;
import java.io.IOException;

public class demo2_filewriter {
    public static void main(String[] args) throws IOException {
//        method_01();
//        method_02();

    }

//    private static void method_02() throws IOException {
//        FileWriter fw = new FileWriter("day14IO/3.txt",true);
//        char[] chars = new char[];
//
//    }

    private static void method_01() throws IOException {
        FileWriter fw = new FileWriter("day14IO/3.txt",true);
        fw.write(99);
        fw.write("hello from java");
        fw.close();
    }

}
