package com.zjc.algorithm.array;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2021/7/20
 * @description :
 */
public class LeetCode35 {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int middle = left + ((right - left) / 2);
            if (nums[middle] == target) {
                return middle;
            }else if (nums[middle] > target) {
                right = middle - 1;
            }else {
                left = middle + 1;
            }
        }
        return right + 1;
    }
}
