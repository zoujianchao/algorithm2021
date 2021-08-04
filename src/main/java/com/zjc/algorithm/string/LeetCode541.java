package com.zjc.algorithm.string;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2021/8/4
 * @description : 反转字符串 II
 */
public class LeetCode541 {
    public String reverseStr(String s, int k) {
        char[] ch = s.toCharArray();
        int n = s.length();
        for (int i = 0; i < n; i += 2 * k) {
            int start = i;
            int end = i + k - 1 < n ? i + k - 1 : n - 1;
            while (start < end) {
                char c = ch[start];
                ch[start] = ch[end];
                ch[end] = c;
                start++;
                end--;
            }
        }
        String res = new String(ch);
        return res;
    }
}
