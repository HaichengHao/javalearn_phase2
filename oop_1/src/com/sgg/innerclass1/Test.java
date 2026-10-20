package com.sgg.innerclass1;

public class Test {
    public static void main(String[] args) {
        method(new USB(){

            @Override
            public void open() {
                System.out.println("USB已链接");
            }
        });
    }

    public static void method(USB usb){
        usb.open();
    }
}
