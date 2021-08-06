package com.zjc.algorithm.string;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2021/8/6
 * @description : 剑指 Offer 58 - II. 左旋转字符串
 */
public class LeetCodeOffer58Two {
    public String reverseLeftWords(String s, int n) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i >= n) {
                sb1.append(s.charAt(i));
            }else {
                sb2.append(s.charAt(i));
            }
        }
        return sb1.toString() + sb2.toString();
    }
    
}
