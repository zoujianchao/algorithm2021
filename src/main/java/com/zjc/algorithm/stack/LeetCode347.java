package com.zjc.algorithm.stack;

import java.util.*;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2021/9/14
 * @description : 前 K 个高频元素
 */
public class LeetCode347 {
    public int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
        //根据map的val正序排序,相当于一个小顶堆
        PriorityQueue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>(Comparator.comparingInt(Map.Entry::getValue));
        for (Map.Entry<Integer, Integer> entry : entries) {
            queue.offer(entry);
            if (queue.size() > k) {
                queue.poll();
            }
        }
        for (int i = k - 1; i >= 0; i--) {
            result[i] = Objects.requireNonNull(queue.poll()).getKey();
        }
        return result;
    }
    
    public static void main(String[] args) {
    
    }
}
