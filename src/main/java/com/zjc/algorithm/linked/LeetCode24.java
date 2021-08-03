package com.zjc.algorithm.linked;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2021/8/3
 * @description :
 */
public class LeetCode24 {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        //获取当前节点的下一个节点
        ListNode next = head.next;
        //进行递归
        ListNode newNode = swapPairs(next.next);
        //交换
        next.next = head;
        head.next = newNode;
        return next;
    }
}
