package com.zjc.algorithm.hash;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2021/8/3
 * @description : 四数相加II
 */
public class LeetCode454 {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer, Integer> map = new HashMap<>();
        int res = 0;
        int sumA = 0;
        int sumB = 0;
        for (int a : nums1) {
            for (int b : nums2) {
                sumA = a + b;
                if (map.containsKey(sumA)) {
                    map.put(sumA, map.get(sumA) + 1);
                }else {
                    map.put(sumA, 1);
                }
            }
        }
        for (int c : nums3) {
            for (int d : nums4) {
                sumB = -(c + d);
                if (map.containsKey(sumB)) {
                    res += map.get(sumB);
                }
            }
        }
        return res;
    }
}
