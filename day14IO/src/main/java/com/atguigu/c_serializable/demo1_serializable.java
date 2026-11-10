package com.atguigu.c_serializable;

import java.io.*;
/*
1.概述:ObjectOutputStream
2.作用:写对象
3.构造:
  ObjectOutputStream(OutputStream os)
4.方法:
  writeObject(对象)
5.注意:
  如果想要序列化一个对象,此对象必须实现Serializable接口(implements Serializable )
 */

/*
1.概述:反序列化 -> ObjectInputStream
2.作用:读对象
3.构造:
  ObjectInputStream(InputStream is)
4.方法:
  readObject()
 */

/*
1.问题描述:如果我们修改了对象的源码,没有重新序列化,直接就反序列化,会出现"序列号冲突问题"
2.原因:当我们修改了源代码之后,没有重新序列化,直接反序列化的时候class文件中的新的序列号和文件中存的序列号不一样了
3.解决:
  a.修改源码之后,重新序列化一下子
  b.在被操作的对象中将序列号定死 -> 推荐
 important:   static final long serialVersionUID = 42L;
 */
public class demo1_serializable {
    public static void main(String[] args) throws Exception {
//        writer();
        reader();
    }

    private static void reader() throws Exception{
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("day14IO/3.txt"));
        Object o = ois.readObject();
        Person p = (Person) o;
        System.out.println(p);
        ois.close();
    }

    private static void writer() throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("day14IO/3.txt"));
        Person p1 = new Person("张三",18);
        oos.writeObject(p1);
        oos.close();
    }
}
