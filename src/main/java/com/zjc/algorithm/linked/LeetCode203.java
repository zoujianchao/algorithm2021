package com.zjc.algorithm.linked;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2021/8/3
 * @description : 移除链表元素
 */
public class LeetCode203 {
    public ListNode removeElements(ListNode head, int val) {
        while (head != null && head.val == val) {
            head = head.next;
        }
        if (head == null) {
            return head;
        }
        ListNode pre = head;
        ListNode cur = head.next;
        while (cur != null) {
            if (cur.val == val) {
                pre.next = cur.next;
            }else {
                pre = cur;
            }
            cur = cur.next;
        }
        return head;
    }
}

class ListNode {
    public int val;
    public ListNode next;
    
    public ListNode() {
    }
    public ListNode(int val) {
        this.val = val;
    }
    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
    
    public int getVal() {
        return val;
    }
    
    public void setVal(int val) {
        this.val = val;
    }
    
    public ListNode getNext() {
        return next;
    }
    
    public void setNext(ListNode next) {
        this.next = next;
    }
}