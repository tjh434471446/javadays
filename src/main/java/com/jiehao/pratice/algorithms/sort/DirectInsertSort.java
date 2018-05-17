package com.jiehao.pratice.algorithms.sort;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DirectInsertSort{
    public static int[] excute(int[] in){
        Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);
        logger.error("message");
        for(int i = 1;i < in.length; i++){
            int temp = in[i];
            int j;
            for(j = i - 1;j >= 0; j--){
                if(in[j] > temp){
                    in[j + 1] = in[j];
                }else{
                    break;
                }
            }
            in[j + 1] = temp;
        }
        return in;
    }
}