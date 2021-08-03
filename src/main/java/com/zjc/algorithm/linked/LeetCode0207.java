package com.zjc.algorithm.linked;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2021/8/3
 * @description : 面试题 02.07. 链表相交
 */
public class LeetCode0207 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode currA = headA;
        ListNode currB = headB;
        // 要么相遇即节点相等，要么都为空即无缘无分，最终都能跳出感情的死循环。
        while (currA != currB) {
            // 两人以相同的速度（一次一步）沿着各自的路径走，当走完各自的路时，再“跳”至对方的路上。（起点平齐速度相同，终点即为相遇点）
            currA = (currA == null ? headB:currA.next);
            currB = (currB == null ? headA:currB.next);
        }
        return currA;
    }
}
