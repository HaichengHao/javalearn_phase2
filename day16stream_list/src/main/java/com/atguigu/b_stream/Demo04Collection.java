package com.atguigu.b_stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

public class Demo04Collection {
    @Test
    public void test01() {
        Collection<String> collection1 = new ArrayList<>();
        //boolean add(E e) : 将给定的元素添加到当前集合中(我们一般调add时,不用boolean接收,因为add一定会成功)
        collection1.add("张无忌");
        collection1.add("敏敏妹妹");
        collection1.add("芷若妹妹");
        System.out.println(collection1);
        //boolean addAll(Collection<? extends E> c) :将另一个集合元素添加到当前集合中 (集合合并)
        Collection<String> collection2 = new ArrayList<>();
        collection2.add("小昭妹妹");
        collection2.add("不悔妹妹");

        collection1.addAll(collection2);
        System.out.println(collection1);
        //void clear():清除集合中所有的元素
        collection2.clear();
        System.out.println(collection2);
        //boolean contains(Object o)  :判断当前集合中是否包含指定的元素
        System.out.println(collection1.contains("小昭妹妹"));
        //boolean isEmpty() : 判断当前集合中是否有元素->判断集合是否为空
        System.out.println(collection1.isEmpty());
        //boolean remove(Object o):将指定的元素从集合中删除
        collection1.remove("小昭妹妹");
        System.out.println(collection1);
        //int size() :返回集合中的元素个数。
        System.out.println(collection1.size());
        //Object[] toArray(): 把集合中的元素,存储到数组中
        Object[] arr = collection1.toArray();
        for (Object o : arr) {
            System.out.println(o);
        }
    }
}
