package com.atguigu.b_lombok;

import lombok.*;

//lombok可以简化javabean开发
@Getter //私有属性的get方法
@Setter //私有属性的set方法
@NoArgsConstructor //无参构造
@AllArgsConstructor //有参构造
@ToString
@EqualsAndHashCode
//或者,你可以直接写@Data,它包含了上面除了上面有参构造以外的所有上述方法
@Data
public class Person {
    private String name;
    private int age;

//没有lombok之前下边都得自己写
//    public Person() {
//
//    }
//    public Person(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
}
