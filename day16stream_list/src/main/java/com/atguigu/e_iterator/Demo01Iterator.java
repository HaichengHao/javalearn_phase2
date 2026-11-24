package com.atguigu.e_iterator;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Demo01Iterator {
    @Test
    public void test01() {
        ArrayList<String> lst1 = new ArrayList<>();
        lst1.add("张三");
        lst1.add("李四");
        lst1.add("王五");

        //获取迭代器对象
        Iterator<String> iterator = lst1.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            System.out.println(s);
            /*
            张三
            李四
            王五
             */
        }

        //在迭代的过程中,获取的次数要和元素个数对应，不然容易出现“没有可操作的元素异常”
        //其实和python中迭代器一样的，迭代器迭代完毕就会结束


    }

    @Test
    public void test02() {
        ArrayList<String> lst = new ArrayList<>();
        lst.add("唐僧");
        lst.add("孙悟空");
        lst.add("猪八戒");
        lst.add("沙僧");

        //遍历集合,遍历到猪八戒的时候就往里塞一个白龙马
//        for (String s : lst) {
//            if ("猪八戒".equals(s)) {  //important:注意需要用equals,不能用==,不然会报错
////            System.out.println(s);
//                lst.add("白龙马");
//            }
//
//            System.out.println(lst);
//        }


        //important:上面写法是错的,下面这样写才对!!!

        /*
        在遍历 ArrayList 的同时调用 lst.add("白龙马")，这会抛出 ConcurrentModificationException！因为 Java 的增强 for 循环（for-each）底层使用迭代器，不允许在遍历过程中修改集合结构。
         */
        ListIterator<String> it = lst.listIterator();
        while (it.hasNext()) {
            String s = it.next();
            if ("猪八戒".equals(s)) {
                it.add("白龙马"); // 安全插入
            }
        }
        System.out.println(lst);
//        [唐僧, 孙悟空, 猪八戒, 白龙马, 沙僧]
    }

}
