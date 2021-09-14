package com.zjc.algorithm.stack;

import java.util.LinkedList;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2021/9/14
 * @description : 滑动窗口最大值
 * https://leetcode-cn.com/problems/sliding-window-maximum/
 */
public class LeetCode239 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length < 2) return nums;
        //双向队列 保存当前窗口的最大值的数组位置 保证队列中数组位置的数值按从大到小排序
        LinkedList<Integer> queue = new LinkedList<>();
        //结果数组
        int[] result = new int[nums.length - k + 1];
        //遍历数组
        for (int i = 0; i < nums.length; i++) {
            //保证从大到小 如果前面的数小则依次弹出 直至满足要求
            while (!queue.isEmpty() && nums[queue.peekLast()] <= nums[i]) {
                queue.pollLast();
            }
            //添加当前值对应的数组下标
            queue.addLast(i);
            //判断当前队列中队首的值是否有效
            if (queue.peek() <= i - k) {
                queue.poll();
            }
            //当窗口长度为k时 保存当前窗口中的最大值
            if (i + 1 >= k) {
                result[i + 1 - k] = nums[queue.peek()];
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        int[] nums = new int[]{1,5,-1,-3,2,3,6,7};
        int k = 3;
//        maxSlidingWindow(nums, k);
    }
}
