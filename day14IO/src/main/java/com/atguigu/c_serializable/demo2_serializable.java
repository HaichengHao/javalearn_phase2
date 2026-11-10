package com.atguigu.c_serializable;

import java.io.*;
import java.util.ArrayList;
/*
1.问题描述:
  如果我们读取对象的次数和存的对象的个数不一致,会出现EOFException(文件意外到达结尾异常)
2.解决:
  将多个对象放到一个集合对象中,然后将这一个集合对象序列化到文件里面
  这样我们在反序列化的时候,只需要反序列化一次就能将这个集合对象读取出来
  集合对象是有长度的,存了多少个元素长度就是多少,我们就直接循环读取多少次
 */

public class demo2_serializable {
    public static void main(String[] args) throws Exception {
//        writer();
        reader();
    }

    private static void reader() throws Exception{
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("day14IO/3.txt"));
        Object o = ois.readObject();
        ArrayList<Person> p_lst= (ArrayList<Person>) o;
        System.out.println(p_lst);//[Person{name='张三', age=18}, Person{name='李四', age=19}, Person{name='王五', age=20}]
        for (Person person : p_lst) {
            System.out.println(person);
            /*
            Person{name='张三', age=18}
            Person{name='李四', age=19}
            Person{name='王五', age=20}
             */
        }
        ois.close();
    }

    private static void writer() throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("day14IO/3.txt"));
        Person p1 = new Person("张三",18);
        Person p2 = new Person("李四",19);
        Person p3 = new Person("王五",20);

        //创建一个集合,可以回顾github中我上传的一阶段https://github.com/HaichengHao/java_learn/blob/master/api-arraylist/src/com/itheima/arrlistdemo2/Test3.java
        ArrayList<Person> p_lst= new ArrayList<>();
        p_lst.add(p1);
        p_lst.add(p2);
        p_lst.add(p3);
//        for(int i = 0;i<p_lst.size();i++){
//            oos.writeObject(p_lst.get(i));
//        }
        oos.writeObject(p_lst);
        oos.close();
    }
}
