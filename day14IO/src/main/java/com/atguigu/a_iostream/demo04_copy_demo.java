package com.atguigu.a_iostream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
文件的复制
 */
public class demo04_copy_demo{
    public static void main(String[] args) throws IOException {
        //1.创建FileInputStream用于将本地上的文件读到内存中
        FileInputStream fis = new FileInputStream("day14IO/1.txt");
        //2.创建FileOutputStream用于将内存中的文件写出到磁盘中
        FileOutputStream fos = new FileOutputStream("day14IO/1_cp.txt",true);

        //3.创建数组,数组长度一般都是1024或者其倍数
        byte[] b_l = new byte[1024];//一般读1024

        //4.边读边写
        int len=0;
        while ((len=fis.read(b_l))!=-1){
            fos.write(b_l,0,len);
        }

        //5.关流->先开的后关
        fos.close();
        fis.close();





    }
}
