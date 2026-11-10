package com.atguigu.b_charstream;

import java.io.FileReader;
import java.io.IOException;

/*
1.概述:字符输入流->Reader(抽象类) -> 子类:FileReader
2.作用:读数据
3.构造:
  FileReader(File file)
  FileReader(String path)
4.方法:
  int read()一次读一个字符
  int read(char[] chars)一次读一个字符数组,返回的是读取个数
  int read(char[] chars,int offset,int count) 一次读一个字符数组一部分
  close()关流
 */
public class demo1_filereader {
    public static void main(String[] args) throws IOException {
//        FileReader fr = new FileReader("day14IO/2.txt");
////        int data = fr.read();
//        int data = 0;
//        while ((data=fr.read())!=-1){
//            System.out.println((char) data);
//        }
        //method_1();
        method_2();

    }
    private static void method_1() throws IOException{
        FileReader fr = new FileReader("day14IO/2.txt");
//        int data = fr.read();
        int data = 0;
        while ((data=fr.read())!=-1){
            System.out.println((char) data);
        }
    }

    private static void method_2() throws IOException{
        FileReader fr = new FileReader("day14IO/2.txt");
        char[] chars = new char[2];//设定为一次读两个字符
        int len=0;
        while ((len=fr.read(chars))!=-1){
            System.out.println(new String(chars,0,len));//一次输出两个字符
        }
    }
}
