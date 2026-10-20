package com.sgg.innerclass1;

public class Test2 {
    public static void main(String[] args) {
        USB usb = method();
        usb.open();
    }

    public static USB method(){//返回的是USB类型
        return new USB() {
            @Override
            public void open() {
                System.out.println("打开USB");
            }
        };
    }
}
