package com.zjc.algorithm.string;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2021/8/4
 * @description : 反转字符串
 */
public class LeetCode344 {
    public void reverseString(char[] s) {
        for (int i = 0, j = s.length - 1; i < s.length / 2; i++, j--) {
            char c = s[i];
            s[i] = s[j];
            s[j] = c;
        }
    }
}
