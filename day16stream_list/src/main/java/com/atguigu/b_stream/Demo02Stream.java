package com.atguigu.b_stream;

import java.util.ArrayList;
import java.util.stream.Stream;

/*
   1. 第一个队伍只要名字为3个字的成员姓名；//filter

   2. 第一个队伍筛选之后 只要前3个人；//limit

   3. 第二个队伍只要姓张的成员姓名； //filter

   4. 第二个队伍筛选之后不要前2个人；//skip

   5. 将两个队伍合并为一个队伍；//concat

   6. 打印整个队伍的姓名信息;//forEach


 */
public class Demo02Stream {
    public static void main(String[] args) {
        ArrayList<String> one = new ArrayList<>();
        one.add("迪丽热巴");
        one.add("宋远桥");
        one.add("苏星河");
        one.add("老子");
        one.add("庄子");
        one.add("孙子");
        one.add("洪七公");

        ArrayList<String> two = new ArrayList<>();
        two.add("古力娜扎");
        two.add("张无忌");
        two.add("张三丰");
        two.add("赵丽颖");
        two.add("张二狗");
        two.add("张天爱");
        two.add("张三");


        //将两个集合转成Stream流
        Stream<String> s1 = one.stream();
        Stream<String> s2 = two.stream();
        Stream<String> streamone = s1.filter(s->s.length()==3).limit(3);
        Stream<String> streamtwo = s2.filter(s->s.startsWith("张")).skip(2);
        Stream.concat(streamone,streamtwo).forEach(s-> System.out.println(s));
    }
}


