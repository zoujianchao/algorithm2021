package com.zjc.algorithm.array;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2021/8/18
 * @description :
 */
public class LeetCode26 {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int p = 0;
        int q = 1;
        while (q < nums.length) {
            if (nums[p] != nums[q]) {
                nums[p + 1] = nums[q];
                p++;
            }
            q++;
        }
        return p + 1;
    }
}
