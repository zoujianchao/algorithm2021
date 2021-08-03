package com.zjc.algorithm.hash;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2021/8/3
 * @description : 有效的字母异位词
 */
public class LeetCode242 {
    public boolean isAnagram(String s, String t) {
        int[] record = new int[26];
        for (char c : s.toCharArray()) {
            record[c - 'a'] += 1;
        }
        for (char c : t.toCharArray()) {
            record[c - 'a'] -= 1;
        }
        for (int i : record) {
            if (i !=0 ) {
                return false;
            }
        }
        return true;
    }
}
