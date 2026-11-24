package com.atguigu.a_list;

import org.junit.Test;

import java.util.LinkedList;

public class Demo02_Linkedlist {
    /*
    1.概述:LinkedList是List接口的实现类
    2.特点:
      a.元素有序
      b.无索引
      c.元素可重复
      d.线程不安全
    3.数据结构:
      双向链表
    4.LinkedList特有方法:有大量直接操作首尾元素的方法
      public void addFirst(E e):将指定元素插入此列表的开头。
      public void addLast(E e):将指定元素添加到此列表的结尾。
      public E getFirst():返回此列表的第一个元素。
      public E getLast():返回此列表的最后一个元素。
      public E removeFirst():移除并返回此列表的第一个元素。
      public E removeLast():移除并返回此列表的最后一个元素。
      public E pop():从此列表所表示的堆栈处弹出一个元素。
      public void push(E e):将元素推入此列表所表示的堆栈。
     */
    @Test
    public void test01(){
        LinkedList<String> list = new LinkedList<>();
        list.add("开心超人");
        list.add("多啦A梦");
        list.add("柯南");
        list.add("加菲猫");

        list.addFirst("小猫");
        list.addLast("小狗");

        System.out.println(list);
        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        list.removeFirst();
        list.removeLast();

    }


    @Test
    public void test02(){
        LinkedList<String> list = new LinkedList<>();
        list.add("开心超人");
        list.add("多啦A梦");
        list.add("柯南");
        list.add("加菲猫");
        list.pop();

        System.out.println(list);

        list.push("小猫");

        System.out.println(list);

    }


    //先进后出
    @Test
    public void test03(){
        LinkedList<String> list = new LinkedList<>();
        list.push("开心超人");
        list.push("多啦A梦");
        list.push("加菲猫");

        System.out.println(list);
        //[加菲猫, 多啦A梦, 开心超人]
    }

    @Test
    public void test04(){
        LinkedList<String> list = new LinkedList<>();
        list.add("a");
        list.add("b");
        System.out.println(list);
    }

}
