package com.zjc.algorithm.string;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2021/8/4
 * @description : 翻转字符串里的单词
 */
public class LeetCode151 {
    public String reverseWords(String s) {
        String[] ss = s.trim().split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = ss.length - 1; i >= 0; i--) {
            if ("".equals(ss[i])) {
            }else {
                sb.append(ss[i]).append(" ");
            }
        }
        return sb.toString().trim();
    }
}
