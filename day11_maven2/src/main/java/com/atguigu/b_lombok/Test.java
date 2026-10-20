package com.atguigu.b_lombok;

public class Test {

    public static void main(String[] args) {
        Person p1 = new Person("张三",12);
        Person p2 = new Person("张三",12);

        System.out.println(p1.equals(p2)); //false
        System.out.println(p1.getName());
        p1.setAge(19);
        System.out.println(p1.getAge());

        System.out.println(p1); //这里是调用了toString
    }
    /*
    张三
    19
    Person(name=张三, age=19)
     */



}
