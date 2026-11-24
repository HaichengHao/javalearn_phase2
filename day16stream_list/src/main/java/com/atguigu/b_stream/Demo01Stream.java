package com.atguigu.b_stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo01Stream {
    @Test
    public void test01(){
        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        list.add("你好");
        list.add("aloha");
        list.add("bonjour");
        list.add("konichiwa");

        //增强for
//        for (String s : list) {
//            System.out.println(s);
//        }

        //需求1.筛选出首字母为a的,放到一个李彪当中
        ArrayList<String> list1 = new ArrayList<>();
        for (String s : list) {
            if(s.startsWith("a")){
                list1.add(s);
            }
        }

        //需求2:筛选长度为2的
        ArrayList<String> list2 = new ArrayList<>();
        for (String s : list) {
            if(s.length()==2){
                list2.add(s);
            }
        }

        //遍历list2
        for (String s : list2) {
            System.out.println(s);
        }


        //可以发现上面的都是在一条流水线的基础上完成的，这时候就可以用stream流对象
        Stream<String> stream = list.stream();
        stream.filter(s->s.startsWith("a")).filter(s->s.length()==5).forEach(s-> System.out.println(s));

    }

    //Stream获取
    @Test
    public void test02(){
        //针对数组的获取方式 .of()
        Stream<String> stream1 = Stream.of("蜡笔小新", "数码宝贝", "熊出没", "钢铁飞龙");
        System.out.println(stream1);//java.util.stream.ReferencePipeline$Head@3a82f6ef

        //针对于集合的获取方式 list.stream()
        ArrayList<String> list = new ArrayList<>();
        list.add("洛洛历险记");
        list.add("迪迦奥特曼");
        list.add("假面骑士build");

        Stream<String> stream2 = list.stream();
        System.out.println(stream2);//输出的是地址值


    }


    //.forEach()和.count()方法
    @Test
    public void test03(){
        Stream<String> stream = Stream.of("cherry","apple","banana","orange");
        stream.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        stream.forEach(s-> System.out.println(s));
    }


    //stream.cout()返回流中的元素个数
    @Test
    public void test04(){
        Stream<String> stream = Stream.of("蜡笔小新", "数码宝贝", "熊出没", "钢铁飞龙");
        System.out.println((stream.count()));
    }

    //.filter()

    /*
    Returns a stream consisting of the elements of this stream that match the given predicate.
    它会返回一个新的stream流对象出来,所以要接收
     */
    @Test
    public void test05(){
        Stream<String> stream = Stream.of("蜡笔小新", "数码宝贝", "熊出没", "钢铁飞龙");
        Stream<String> stream1 = stream.filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length()>3;
            }
        });

//        stream.filter(s->s.length()>3);


        stream1.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
                /*
                蜡笔小新
                数码宝贝
                钢铁飞龙
                 */
            }
        });



        //或者这样连起来写
        stream.filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length()>3;
            }
        }).forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

    }


    //.limit()用法
    //获取Stream流对象中的前n个元素,返回一个新的Stream流对象
    @Test
    public void test06(){
        Stream<String> stream = Stream.of("蜡笔小新", "数码宝贝", "熊出没", "钢铁飞龙");
        stream.limit(3).forEach(s-> System.out.println(s));//获取前三个
    }

    //.skip()
    //跳过Stream流对象中的前n个元素,返回一个新的Stream流对象
    @Test
    public void test07(){
        Stream<String> stream = Stream.of("蜡笔小新", "数码宝贝", "熊出没", "钢铁飞龙");
        Stream<String> stream1 = stream.skip(2);
        stream1.forEach(s-> System.out.println(s));
        /*
        熊出没
        钢铁飞龙

         */
    }

    //Static<T> Stream<T> concat(Stream<?extends T>a,Stream<?extends T>b);
    //静态方法，直接调用
    //两个流合并成一个流

    @Test
    public void test08(){
        Stream<String> stream = Stream.of("蜡笔小新", "数码宝贝", "熊出没", "钢铁飞龙");
        Stream<String> stream1 = Stream.of("天下英雄","三国志");
        Stream<String> stream2 = Stream.concat(stream,stream1);
        stream2.forEach(s-> System.out.println(s));
        /*
        蜡笔小新
        数码宝贝
        熊出没
        钢铁飞龙
        天下英雄
        三国志
         */
    }



    //流转为集合
    @Test
    public void test09(){
        Stream<String> stream = Stream.of("蜡笔小新", "数码宝贝", "熊出没", "钢铁飞龙");
        List<String> list = stream.collect(Collectors.toList());//或者stream.toList()
        System.out.println(list);
        /*
        [蜡笔小新, 数码宝贝, 熊出没, 钢铁飞龙]
         */
    }


    //去重
    @Test
    public void test10(){
        Stream<String> stream = Stream.of("蜡笔小新", "数码宝贝", "熊出没", "钢铁飞龙","熊出没");
        Stream<String> stream1 = stream.distinct();
        System.out.println(stream1.toList());
        //[蜡笔小新, 数码宝贝, 熊出没, 钢铁飞龙]

    }


    //Stream.of(对象)
    @Test
    public void test11(){
        Stream<Person> personStream = Stream.of(new Person("张三", 11), new Person("李四", 19),new Person("李四", 19));
        personStream.distinct( ).forEach(person -> System.out.println(person));//去重
        /*
        Person(name=张三, age=11)
        Person(name=李四, age=19)
         */
    }

    //.map()
    @Test
    public void test12(){
        Stream<Integer> stream = Stream.of(1,2,3,4,5,6);
        stream.map(new Function<Integer, String>() {
            @Override
            public String apply(Integer integer) {
                return integer+"";
            }
        }).forEach(s-> System.out.println(s));
    }


}
