package com.atguigu.j_lambda;

import static com.atguigu.j_lambda.Demo02Lambda.method;

/*
1.涛哥秘籍:
  a.先观察,是否是函数式接口做方法参数传递或者返回值返回
  b.如果是,调用方法,以匿名内部类传参或者返回
  c.从new接口开始到重写方法的方法名结束,选中,删除,然后别忘记多删除一个右半个大括号
  e.在重写方法的参数和重写方法的方法体之间加 ->

2.省略规则:
  a.重写方法的参数类型可以省略
  b.重写方法的参数如果只有一个参数,数据类型和所在的小括号可以省略
  c.如果重写方法的方法体只有一句,所在的大括号和分号可以省略
  d.如果重写方法的方法体只有一句,并且带return的,那么所在的大括号,分号以及return都可以省略
 */
public class Demo03Lambda {
    public static void main(String[] args) {
        method(new USB2(){
            @Override
            public String open(String name){
                return name+"打开了";
            }

        });

        System.out.println("========================");


        //或者这样用lambda改造
        //学下来真的很像es6
        method((String name)->name+"打开了");
        method(name -> name+"打开了");


        System.out.println("=======================");
        String result = method02().open("键盘");
        System.out.println(result);
    }

    public static void method(USB2 usb){
        String result=usb.open("鼠标");
        System.out.println(result);
    }

    //改造
    public static USB2 method02(){
        return name-> name+"打开了";
    }
}
