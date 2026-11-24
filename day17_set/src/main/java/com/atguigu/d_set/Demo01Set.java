package com.atguigu.d_set;

import com.atguigu.b_collections.Person;
import org.junit.Test;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

//集合
public class Demo01Set {
    @Test
    public void test01(){
        //新建一个HashSet
        Set<String> set = new HashSet<>();
        set.add("小猫");
        set.add("小狗");
        set.add("小刺猬");
        set.add("小羊");
        set.add("小牛");
        set.add("小羊");
        System.out.println(set);
        //[小羊, 小刺猬, 小狗, 小猫, 小牛] 无序的,且去重的

        for (String s : set) {
            System.out.println(s);
        }
        /*
        小羊
        小刺猬
        小狗
        小猫
        小牛
         */
    }


    //LinkedHashSet
    //有序的
    @Test
    public void test02(){
        //新建一个HashSet
        Set<String> set = new LinkedHashSet<>();
        set.add("小猫");
        set.add("小狗");
        set.add("小刺猬");
        set.add("小羊");
        set.add("小牛");
        set.add("小羊");
        System.out.println(set);


        for (String s : set) {
            System.out.println(s);
        }
        /*
        [小猫, 小狗, 小刺猬, 小羊, 小牛]
        小猫
        小狗
        小刺猬
        小羊
        小牛
         */
    }

    @Test
    public void test03(){
        Person p1 = new Person("张三",12);
        Person p2 = new Person("张三",12);

        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());

        System.out.println("===================");

        String s1 = "abc";
        String s2 = new String("abc");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        /* 哈希值一样但内容不一样的情况叫做哈希冲突
        哈希值不一样内容一定不一样，哈希值一样内容也有可能不一样(这种情况叫做哈希冲突)
        779078
        779078
        ===================
        96354
        96354
         */

    }
}
