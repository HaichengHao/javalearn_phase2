package com.atguigu.d_ticket;

public class Demo01Ticket {
    public static void main(String[] args) {
        My_ticket myTicket = new My_ticket();
        Thread t1 = new Thread(myTicket);
        Thread t2 = new Thread(myTicket);
        Thread t3 = new Thread(myTicket);
        t1.start();
        t2.start();
        t3.start();
    }
}
