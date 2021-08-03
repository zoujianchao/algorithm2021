package com.zjc.algorithm.hash;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2021/8/3
 * @description :  赎金信
 */
public class LeetCode383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] arr = new int[26];
        int temp;
        for (int i = 0; i < magazine.length(); i++) {
            temp = magazine.charAt(i) - 'a';
            arr[temp]++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            temp = ransomNote.charAt(i) - 'a';
            if (arr[temp] > 0) {
                arr[temp]--;
            }else {
                return false;
            }
        }
        return true;
    }
}
