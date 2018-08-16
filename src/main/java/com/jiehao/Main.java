package com.jiehao;
import com.jiehao.pratice.lectcode.MaxArea;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);
        logger.error("message");
        logger.info("info");
//        char s = 'a';
//        String bit = Integer.toBinaryString(s);
//        System.out.println("Base91 = " + Base91.encode("test"));
//        System.out.println("Base91 = " + Base91.encode("fPNKd"));
//        System.out.println("Base91 = " + Base91.encode("Hello World!"));
//        System.out.println("Base91 = " + Base91.encode(">OwJh>Io0Tv!8PE"));
//        Numbers2Plus.excute();
        //MaxArea.test();
        int[] a = {1,2,2,3,4};
        int[] b = {1,2,2,3,4};
        //test(a);
        System.out.println("main" + Arrays.toString(a));
        System.out.println(Arrays.equals(a,b));

    }
    public static void test(int[] a){
        a[0] = 1000;
        System.out.println("test" + Arrays.toString(a));
    }
}
