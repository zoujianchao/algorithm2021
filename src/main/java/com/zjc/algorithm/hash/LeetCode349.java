package com.zjc.algorithm.hash;

import java.util.HashSet;
import java.util.Set;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2021/8/3
 * @description :
 */
public class LeetCode349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        if (nums1 == null || nums1.length == 0 || nums2 == null || nums2.length == 0) {
            return new int[0];
        }
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        for (int i : nums1) {
            s1.add(i);
        }
        for (int i : nums2) {
            if (s1.contains(i)) {
                s2.add(i);
            }
        }
        int[] res = new int[s2.size()];
        int index = 0;
        for (int i : s2) {
            res[index++] = i;
        }
        return res;
    }
}
