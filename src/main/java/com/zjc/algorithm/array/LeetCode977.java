package com.zjc.algorithm.array;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2021/7/21
 * @description : 有序数组的平方
 */
public class LeetCode977 {
    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int[] res = new int[nums.length];
        int index = res.length - 1;
        while (left <= right) {
            if (nums[left] * nums[left] > nums[right] * nums[right]) {
                res[index--] = nums[left] * nums[left];
                ++left;
            }else {
                res[index--] = nums[right] * nums[right];
                --right;
            }
        }
        return res;
    }
}
