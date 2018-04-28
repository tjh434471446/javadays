package main.java.pratice.codewars;

import java.text.DecimalFormat;

public class CountIPAddresses {
    public static long ipsBetween(String start, String end) {
        DecimalFormat df = new DecimalFormat("00000000");
        StringBuilder startBinary = new StringBuilder();
        StringBuilder endBinary = new StringBuilder();
        String[] strartArr = start.split("\\u002E");
        String[] endArr = end.split("\\u002E");
        for (String s : strartArr){
            startBinary.append(df.format(Integer.valueOf(Integer.toBinaryString(Integer.parseInt(s)))));
        }
        for (String s : endArr){
            endBinary.append(df.format(Integer.valueOf(Integer.toBinaryString(Integer.parseInt(s)))));
        }
        return Long.valueOf(endBinary.toString(),2) - Long.valueOf(startBinary.toString(),2);
    }
    public static void test(){
        String start = "20.0.0.10";
        String end = "20.0.1.0";
        long ret = ipsBetween(start,end);
        System.out.println(ret);
        int a = 100;
        String bin = Integer.toBinaryString(a);
        System.out.println (Integer.toBinaryString (a));
        DecimalFormat df = new DecimalFormat("00000000");
        String format = df.format(Integer.valueOf(bin));
        System.out.println(format);
    }
}
