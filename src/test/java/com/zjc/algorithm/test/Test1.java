package com.zjc.algorithm.test;

import java.util.Arrays;
import java.util.List;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2021/8/23
 * @description :
 */
public class Test1 {
    public static void main(String[] args) {
        double x = 3.5;
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        String interval1 = "1-3";
        String interval2 = "4-5";
        String interval3 = "7-9";
        String interval4 = "10-15";
        String y = String.valueOf(x);
        String[] split = y.split(".");
        int location = search(nums, Integer.valueOf(split[0]));
        if (location == -1) {
            System.out.println("区间外");
        } else {
            if (Integer.valueOf(split[1]) == 0) {
                if (nums[location] >= 1 && nums[location] <= 3) {
                    System.out.println("在区间1-3");
                }else if (nums[location] >= 4 && nums[location] <= 5) {
                    System.out.println("在区间4-5");
                }else if (nums[location] >= 7 && nums[location] <= 9) {
                    System.out.println("在区间7-9");
                }else if (nums[location] >= 10 && nums[location] <= 15) {
                    System.out.println("在区间10-15");
                }else {
                    System.out.println("区间外");
                }
            }else {
            
            }
        }
        
    
    }
    
    public static int search(int[] nums, int target) {
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
