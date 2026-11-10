package com.atguigu.a_iostream;

import java.io.FileInputStream;
import java.io.IOException;

public class demo03inputstream {
    /*
    一次读一个字节数组
          数组相当于一个临时存储区域,数组定多长,每次就读取多少个数据
          我们读取的数据会先保存到数组中,然后我们从数组中读取数据
          如果剩下的数据不够数组长度了,那么剩下多少个数据就一次读多少个数据
     */
    public static void main(String[] args) throws IOException {
        method11();
    }

    private static void method11() throws IOException {
        FileInputStream fis = new FileInputStream("day14IO/1.txt");
        byte[] bytes = new byte[2];
        int len= fis.read(bytes);//一次读一个字节数组，我们自己设定的数组长度是2字节
        System.out.println(len);//2一次读俩字节

    }
}
