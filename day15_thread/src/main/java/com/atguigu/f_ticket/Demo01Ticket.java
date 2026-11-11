package com.atguigu.f_ticket;

public class  Demo01Ticket {
    public static void main(String[] args) {
        My_ticket myTicket = new My_ticket();
        Thread t1 = new Thread(myTicket,"thread1");
        Thread t2 = new Thread(myTicket,"thread2");
        Thread t3 = new Thread(myTicket,"thread3");
        t1.start();
        t2.start();
        t3.start();
    }
}
