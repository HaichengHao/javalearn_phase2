package com.atguigu.b_charstream;

import java.io.FileReader;
import java.io.IOException;

/*
1.注意:
  a.一个汉字在GBK中,占2个字节
  b.一个汉字在UTF-8中,占3个字节
2.字节流是万能流,但是侧重文件复制,不要边读边看,因为整不好读取的汉字就不完整了,出来就是乱码
  不管编码和解码是否一致,用字节流读取中文,边读边看,整不好都会出现乱码
3.解决:
  我们将文本文档中的内容看成一个一个的字符,按照字符就操作就行了 -> 字符流

  注意:

    字符流读取文本文档,如果编码和解码不一致,也会出现乱码

    但是用字符流读取文本文档,在编码和解码一致的情况下是不会出现乱码的
 */
public class demo0 {
    public static void main(String[] args) throws IOException{
        method01();
    }

    private static void method01() throws IOException {
        FileReader fr = new FileReader("day14IO/2.txt");
        System.out.println(fr.read());

    }
}
