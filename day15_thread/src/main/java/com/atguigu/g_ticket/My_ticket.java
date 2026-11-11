package com.atguigu.g_ticket;

/*
解决线程安全问题的第二种方式:同步方法
普通同步方法_非静态
1.格式:
  修饰符 synchronized 返回值类型 方法名(形参){
       方法体
       return 结果
  }
2.默认锁:this


静态同步方法
1.格式:
  修饰符 static synchronized 返回值类型 方法名(形参){ 就是多了个static
       方法体
       return 结果
  }
2.默认锁:当前类.class 后续jdbc反射会用到哦!
 */
public class My_ticket implements Runnable {
    private static int ticket_num = 100;   //important:注意这里也记得要用static进行修饰

    Object obj = new Object();
    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(100L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static synchronized void method01(){
        if(ticket_num>0){

                System.out.println(Thread.currentThread().getName() + "正在卖第" + ticket_num + "张票");
                ticket_num--;

        }
    }
}
