package com.zjc.algorithm.hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2021/8/4
 * @description : 四数之和
 */
public class LeetCode18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums.length < 4) {
            return res;
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            for (int j = nums.length - 1; j >= 0; j--) {
                if (j < nums.length - 1 && nums[j] == nums[j + 1]) {
                    continue;
                }
                int g = i + 1;
                int k = j - 1;
                while (k > g) {
                    if (nums[i] + nums[j] + nums[g] + nums[k] == target) {
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[g]);
                        list.add(nums[k]);
                        res.add(list);
                        g++;
                        k--;
                        while (g < k && nums[g] == nums[g - 1]) g++;
                        while (g < k && nums[k] == nums[k + 1]) k--;
                    }else if (nums[i] + nums[j] + nums[g] + nums[k] > target) {
                        k--;
                    }else {
                        g++;
                    }
                }
            }
        }
        return res;
    }
}
