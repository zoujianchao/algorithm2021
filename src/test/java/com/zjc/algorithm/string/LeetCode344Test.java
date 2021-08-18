package com.zjc.algorithm.string;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2021/8/18
 * @description :
 */
class LeetCode344Test {
    public void reverseString(char[] s) {
        int n = s.length - 1;
        for (int i = 0, j= n; i <= n/2; i++, j--) {
            char a = s[i];
            s[i] = s[j];
            s[j] = a;
        }
    }
}