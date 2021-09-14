package com.zjc.algorithm.linked;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2021/8/19
 * @description :
 */
class LeetCode19Test {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;
        while (n-- > 0) {
            fast = fast.next;
        }
        ListNode pre = null;
        while (fast != null) {
            pre = slow;
            slow = slow.next;
            fast = fast.next;
        }
        pre.next = slow.next;
        slow.next = null;
        return dummy.next;
    }
}