package com.atguigu.a_iostream;

import java.io.FileOutputStream;
import java.io.IOException;

public class demo1outputstream {
    /*
    1.从专业角度概述,什么叫做IO流:将数据从一个设备上传到另外一个设备上的技术
      a.输出(Output):谁发数据谁就是输出
      b.输入(Input):谁接数据谁就是输入

    2.从javase角度概述,什么叫做IO流:将数据从内存上写到硬盘上,然后还能从硬盘上将数据读回来的技术
      a.输出(Output):将数据从内存中写到硬盘上
      b.输入(Input):将数据从硬盘上读到内存中
     */

    //IO流分类
    /*
    1.字节流:一切皆字节(万能流),但是这个万能流侧重复制操作来说的
      字节输出流:OutputStream(抽象类)
      字节输入流:InputStream(抽象类)
    2.字符流:主要对文本文档进行读写操作
      字符输出流:Writer(抽象类)
      字符输入流:Reader(抽象类)
     */


    //OutputStream中子类[FileOutputStream]的介绍以及方法的简单介绍

    /*
    1.概述:字节输出流 -> OutputStream(抽象类) -> 子类:FileOutputStream
    2.作用:往硬盘上写数据
    3.构造:
      a.FileOutputStream(File file)
      b.FileOutputStream(String path)
      c.FileOutputStream(String path,boolean append) -> 如果append为true,就是追加,续写,每次运行老数据不会被覆盖
    4.方法:
      write(int a) 一次写一个字节
      write(byte[] bytes) 一次写一个字节数组
      write(byte[] bytes,int offset,int count)一次写一个字节数组一部分
      close():关闭资源
    5.特点:
      a.如果之前没有创建指定的文件,运行时会自动创建
      b.默认情况下,每执行一次都会产生一个新文件,覆盖老文件
     */


    public static void main(String[] args) throws IOException {
//        method01();
//        method02();
//        method03();
//        method04();
        method05();
    }


    //续写,追加
    private static void method05() throws IOException{
        FileOutputStream fos = new FileOutputStream("day14IO/1.txt",true);//append接受的是boolean,为true则表示续写追加，不再覆盖
        byte[] b1 = "\nhello mirine".getBytes();
        fos.write(b1);
        fos.write("\n风吹落叶雪花飘".getBytes());
        fos.close();

    }

    //利用.getBytes()可以将字符串转换为字节数组
    private static void method04() throws IOException{
        FileOutputStream fos = new FileOutputStream("day14IO/1.txt");
        byte[] bytes = "i love java".getBytes();
        fos.write(bytes);
        fos.close();
    }

    //写一个字节数组的一部分
    private static void method03() throws IOException{
        FileOutputStream fos = new FileOutputStream("day14IO/1.txt");
        byte[] bytes = {97,98,99,100};
        fos.write(bytes,0,2);  //相当于写了97,98这俩,从off偏移起始位置开始写，长度为2
        fos.close();
    }

    //写一个字节数组
    private static void method02() throws IOException {
        FileOutputStream fos = new FileOutputStream("day14IO/1.txt");
        byte[] bytes = {97,98,99,100};
        fos.write(bytes); //写一个字节数组,这个数组也会被翻译成ASCII中的abcd
        fos.close();

    }

    //一次写一个字节
    private static void method01() throws IOException {
        FileOutputStream fos = new FileOutputStream("day14IO/1.txt");
        fos.write(97);//97会被翻译成ASCII表中的a
        fos.close();

    }




}
