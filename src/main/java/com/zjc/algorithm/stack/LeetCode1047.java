package com.zjc.algorithm.stack;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2021/9/14
 * @description : 删除字符串中的所有相邻重复项
 */
public class LeetCode1047 {
    public String removeDuplicates(String s) {
        Deque<Character> deque = new ArrayDeque<>();
        char ch;
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            if (deque.isEmpty() || deque.peek() != ch) {
                deque.push(ch);
            }else {
                deque.pop();
            }
        }
        StringBuilder str = new StringBuilder();
        while (!deque.isEmpty()) {
            str.insert(0, deque.pop());
        }
        return str.toString();
    }
}
