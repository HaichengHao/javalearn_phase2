package com.atguigu.b_collections;

import org.junit.Test;

import java.util.*;

public class Demo03_Collections_utils {
    /*
    1.概述:集合工具类
    2.特点:
      a.构造私有
      b.方法静态
    3.使用:类名直接调用
    4.常用方法:
      static <T> boolean addAll(Collection<? super T> c, T... elements)->批量添加元素
      static void shuffle(List<?> list) ->将集合中的元素顺序打乱
      static <T> void sort(List<T> list) ->将集合中的元素按照默认规则排序-> ASCII码值
      static <T> void sort(List<T> list, Comparator<? super T> c)->将集合中的元素按照指定规则排序
     */
    @Test
    public void test01(){
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"小猫","小狗","小刺猬","小牛");
        System.out.println(list);
        //[小猫, 小狗, 小刺猬, 小牛]

        //随机打乱顺序,每次运行都不一样
        Collections.shuffle(list);
        System.out.println(list);
        //[小狗, 小牛, 小刺猬, 小猫]

    }

    @Test
    public void test02(){
        ArrayList<String> list = new ArrayList<>();
        list.add("a.床前明月光");
        list.add("b.疑是地上霜");
        list.add("c.举头望明月");
        list.add("d.低头思故乡");

        //按首字母的ASCII排序
        Collections.sort(list);
        System.out.println(list);




    }

    @Test
    public void test03(){
        ArrayList<Person> list = new ArrayList<>();
        list.add(
                new Person("张三",17)
        );
        list.add(
                new Person("李四",19)
        );
        list.add(
                new Person("王五",16)
        );

        //自己指定排序条件
        Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge()-o2.getAge();
            }
        });
        //static <T> void sort(List<T> list, Comparator<? super T> c)->将集合中的元素按照指定规则排序

        //lambda简化
        Collections.sort(list, (o1,o2)-> o1.getAge()-o2.getAge());
        System.out.println(list);

    }


    @Test
    public void test04(){
        /*
        Arrays中的静态方法:
        static <T> List<T> asList(T...a) -> 直接指定元素,转存到list集合中

        1.注意:
        使用此方法批量添加之后不要修改集合长度了,因为底层是一个数组,数组被final定死了
         */

        List<String> list = Arrays.asList("小猫", "小狗", "小猪", "小牛", "小羊");
        System.out.println(list);
        list.add("小马");
        System.out.println(list);
    }
}
