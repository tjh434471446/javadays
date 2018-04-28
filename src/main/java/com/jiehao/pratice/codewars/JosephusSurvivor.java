package com.jiehao.pratice.codewars;

import java.util.ArrayList;

public class JosephusSurvivor {
    public static int josephusSurvivor(final int n, final int k) {
        ArrayList<Integer> ini = new ArrayList<>();
        for (int i = 1;i <= n;i ++)
        {
            ini.add(i);
        }
        int index = k;
        int iniSize;
        while(ini.size() > 1)
        {
            iniSize = ini.size();
            ini = nextArr(ini,k,index);
            while(index <= iniSize)
            {
                index += k;
            }
            index = index - iniSize;
        }
        return ini.get(0);
    }
    public static ArrayList<Integer> nextArr(ArrayList<Integer> ini, int k, int index)
    {
        ArrayList<Integer> nextArr = new ArrayList<>();
        int count = 1;
        for (int i:ini)
        {
            if ((count == ini.size())&&(nextArr.size() == 0)){
                nextArr.add(i);
                break;
            }
            if (count ++ != index) {
                nextArr.add(i);
            }
            else {
                System.out.println(i + " is out");
                index += k;
            }
        }
        return nextArr;
    }
    public static void test()
    {
        int count = 7;
        int outNum = 3;
        int ret = josephusSurvivor(count,outNum);
        /*
        ArrayList<Integer> ini = new ArrayList<>();
        for (int i = 1;i <= count;i ++)
        {
            ini.add(i);
        }
        ArrayList<Integer> ret = nextArr(ini,outNum,3);
        */
        System.out.println(ret);
        //int survior = josephusSurvivor(count,outNum);
        //System.out.println(survior);
    }
}
