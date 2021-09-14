package com.zjc.algorithm.test;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2021/8/23
 * @description :
 */
public class Test2 {
    public static void main(String[] args) {
        double x = 3.5;
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        if (x >= 1 && x <= 3) {
            System.out.println("在区间1-3");
        } else if (x >= 4 && x <= 5) {
            System.out.println("在区间4-5");
        } else if (x >= 7 && x <= 9) {
            System.out.println("在区间7-9");
        } else if (x >= 10 && x <= 15) {
            System.out.println("在区间10-15");
        } else {
            System.out.println("区间外");
        }
        
        
    }
    
}
