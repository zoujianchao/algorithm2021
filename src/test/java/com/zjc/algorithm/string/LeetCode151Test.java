package com.zjc.algorithm.string;

import java.util.Arrays;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2021/8/18
 * @description :
 */
class LeetCode151Test {
    public String reverseWords(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }
        String[] t = s.trim().split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = t.length - 1; i >= 0; i--) {
            if (!"".equals(t[i])) {
                sb.append(t[i]).append(" ");
            }
        }
        return sb.toString().trim();
    }
}