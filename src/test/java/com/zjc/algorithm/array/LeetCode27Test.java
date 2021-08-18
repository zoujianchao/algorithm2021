package com.zjc.algorithm.array;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2021/8/18
 * @description :
 */
class LeetCode27Test {
    public int removeElement(int[] nums, int val) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j++] = nums[i];
            }
        }
        return j;
    }
}