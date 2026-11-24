package com.atguigu.d_set;

public class Demo02HashCompute {
//String s1 = "abc";   -> byte[] value = {97,98,99}
//System.out.println(s1.hashCode());
//

    public static int hashCode(byte[] value) {
        int h = 0;
        for (byte v : value) {
            h = 31 * h + (v & 0xff);
        }
        return h;
    }
//
//    第一圈:h = 31*0+97 = 97
//    第二圈:h = 31*97+98 = 3105
//    第三圈:h = 31*3105+99 = 96354
}
//为啥每次都用31去乘呢? -> 31是一个质数,31可以极大减少哈希冲突的问题

