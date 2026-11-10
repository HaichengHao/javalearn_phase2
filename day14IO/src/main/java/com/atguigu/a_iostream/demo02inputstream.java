package com.atguigu.a_iostream;

import java.io.FileInputStream;
import java.io.IOException;

/*
1.概述:字节输入流->InputStream(抽象类) -> 子类:FileInputStream
2.作用:读数据->将硬盘上的数据读到内存中
3.构造:
  FileInputStream(File file)
  FileInputStream(String path)
4.方法:
  int read()一次读一个字节,返回的是读取的字节
  int read(byte[] bytes)一次读一个字节数组,返回的是读取字节的个数
  int read(byte[] bytes,int offset,int count)一次读一个字节数组的一部分,返回的是读取字节的个数
  close()关闭资源
 */

/*
1.流中的数据读完之后,就不能再继续读了,如果还想重新读,就再new一个对象

2.读取的过程中,不要连续写多个read

3.流关闭之后,不能再次使用,否则会报错
 */
public class demo02inputstream {
    public static void main(String[] args) throws IOException {
//        method1();
        FileInputStream fis = new FileInputStream("day14IO/1.txt");
        method2(fis);
        method3(fis);
    }
    private static void method2(FileInputStream fis) throws IOException {


        int asc_c=0;
        while((asc_c=fis.read())!=-1){
            System.out.println((char) asc_c);
        }

    }
    private static void method3(FileInputStream fis) throws IOException {
        int asc_c=0;
        while((asc_c=fis.read())!=-1){
            System.out.println((char) asc_c);
        }
        fis.close();
    }


    //循环读取文件
    private static void method1() throws IOException{
        FileInputStream fis = new FileInputStream("day14IO/1.txt");
//        int read_1 = fis.read();
//        System.out.println(read_1);
//        fis.close();
        int ascii_c=0;
        while ((ascii_c=fis.read())!=-1){ //读完之后的值为-1，所以只要读到的字符ascii不为-1就不结束
            System.out.println(ascii_c);
            System.out.println((char) ascii_c);
            /*
            97
            a
            98
            b
            99
            c
            49
            1
            50
            2
            51
            3
            59
            ;
            10
             */
        }
        fis.close();
    }
}
