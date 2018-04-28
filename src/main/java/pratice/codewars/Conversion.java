package main.java.pratice.codewars;

import java.util.HashMap;
import java.util.Map;

public class Conversion {
    public String solution(int n) {
        int[] arr = {1000,500,100,50,10,5,1};
        StringBuilder builder = new StringBuilder();
        for (int num:arr){
            int many = n / num;
            if (many == 0){
                continue;
            }
            for (int i = 0;i < many;i++){
                switch (num){
                    case 1000 : builder.append("M");break;
                    case 500 : builder.append("D");break;
                    case 100 : builder.append("C");break;
                    case 50 : builder.append("L");break;
                    case 10 : builder.append("X");break;
                    case 5 : builder.append("V");break;
                    case 1 : builder.append("I");break;
                    default:break;
                }
                n = n % num;
            }
        }
        //return  builder.toString();
        return formatString(builder.toString());
    }
    public String formatString(String iniStr){
        return iniStr.replace("DCCCC","CM")
                .replace("CCCC","CD")
                .replace("LXXXX","XC")
                .replace("XXXX","XL")
                .replace("VIIII","IX")
                .replace("IIII","IV");
    }
    public void test(){
        int testNum = 984;
        System.out.println(solution(testNum));
    }
}
