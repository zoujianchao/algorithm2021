package com.zjc.algorithm.stack;

import java.util.Stack;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2021/9/14
 * @description : 逆波兰表达式求值
 */
public class LeetCode150 {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*") || tokens[i].equals("/")) {
                int num1 = stack.pop();
                int num2 = stack.pop();
                if (tokens[i].equals("+")) stack.push(num2 + num1);
                if (tokens[i].equals("-")) stack.push(num2 - num1);
                if (tokens[i].equals("*")) stack.push(num2 * num1);
                if (tokens[i].equals("/")) stack.push(num2 / num1);
            }else {
                stack.push(Integer.valueOf(tokens[i]));
            }
        }
        return stack.peek();
    }
}
