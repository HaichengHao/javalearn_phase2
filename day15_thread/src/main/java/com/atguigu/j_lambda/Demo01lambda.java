package com.atguigu.j_lambda;
/*
1.函数式编程思想和Lambda表达式定义格式
1.java核心编程思想:面向对象
  强调的是先new对象,然后调用方法 -> 为啥new对象呀,目的是为了调用对象中的方法 -> 过多的强调new对象这个事儿了
2.函数式编程思想:
  强调的是目的(调用对象的方法),不强调过程(new对象)
3.Lambda表达式:
  格式: () -> {}
  解释说明:
    ():代表的是重写方法的参数位置
    ->:将重写方法的参数传递给重写方法的方法体
    {}:重写方法的方法体
 */
public class Demo01lambda {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("正在执行...");
            }
        }).start();
        System.out.println("===========");

        //lambda表达式
        //有点像js中es6,但是又有区别
        new Thread(()->{
            System.out.println("正在执行");
        }).start();
    }
}
