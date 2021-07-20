package com.zjc.algorithm.array;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2021/7/20
 * @description : 移除元素
 */
public class LeetCode27 {
    public int removeElement(int[] nums, int val) {
        int slowIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (val != nums[i]) {
                nums[slowIndex++] = nums[i];
            }
        }
        return slowIndex;
    }
}
