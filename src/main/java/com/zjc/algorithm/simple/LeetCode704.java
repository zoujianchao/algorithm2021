package com.zjc.algorithm.simple;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2021/7/20
 * @description : 二分法, 左闭右闭
 */
public class LeetCode704 {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        while (l <= r) {
            int m = l + ((r - l) / 2);
            if (nums[m] < target) {
                l = m + 1;
            }else if (nums[m] > target) {
                r = m - 1;
            }else {
                return m;
            }
        }
        return -1;
    }
}
