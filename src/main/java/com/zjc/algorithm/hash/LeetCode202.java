package com.zjc.algorithm.hash;

import java.util.HashSet;
import java.util.Set;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2021/8/3
 * @description : 快乐数
 */
public class LeetCode202 {
    public boolean isHappy(int n) {
        Set<Integer> s = new HashSet<>();
        while (n != 1 && !s.contains(n)) {
            s.add(n);
            n = getSum(n);
        }
        return n == 1;
    }
    
    public static int getSum(int n) {
        int res = 0;
        while (n > 0) {
            int temp = n % 10;
            res += temp * temp;
            n = n / 10;
        }
        return res;
    }
}
