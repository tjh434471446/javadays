package solution.codewars;

import java.util.ArrayList;
import java.util.List;

public class KPrimes {
    public static long[] countKprimes(int k, long start, long end) {
        // your code
        List<Long> ret = new ArrayList<>();
        for (long i = start;i < end;i ++)
        {
            List perList = selectFactor(i);
            if (perList.size() == k)
            {
                ret.add(i);
            }
        }
        long[] out = new long[ret.size()];
        int count = 0;
        for (Object e : ret) {
            out[count] = (long)e;
            count++;
        }
        return out;
    }
    public static int puzzle(int s) {
        // your code
        return 1;
    }
    private static boolean judge(long n) {
        int j = 2;
        if(n < 2)
        {
            return true;
        }
        while(j <= n / 2) {
            if(n % j == 0)
                break;
            j ++;
        }
        if(j == n / 2 + 1) {
            return true;
        }
        return false;
    }
    private static List selectFactor(long num) {
        List<Long> factorNum = new ArrayList<>();
        long j;
        double temp = num;
        if(!judge((int)temp)) {
            for(j = 2;temp>0;j ++) {
                if(judge(j)) {
                    if((temp / j) != (int)(temp / j))
                        continue;
                    temp /= j;
                    factorNum.add(j);
                    if(temp == 1)
                        break;
                    j --;
                }
            }
        }
        return factorNum;
    }
}
