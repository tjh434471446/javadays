package com.jiehao;
import com.jiehao.pratice.lectcode.MaxArea;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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
        MaxArea.test();
    }
}
