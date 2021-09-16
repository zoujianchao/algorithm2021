package com.zjc.algorithm.tree;

import java.util.*;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2021/9/14
 * @description : 二叉树前序遍历
 */
public class LeetCode144 {
    //递归
//    public List<Integer> preorderTraversal(TreeNode root) {
//        List<Integer> list = new ArrayList<Integer>();
//        preOrder(root,list);
//        return list;
//    }
//
//    public void preOrder(TreeNode root, List<Integer> result) {
//        if (root == null) {
//            return;
//        }
//        result.add(root.val);
//        preOrder(root.left, result);
//        preOrder(root.right, result);
//    }
    
    //非递归
//    public List<Integer> preorderTraversal(TreeNode root) {
//        List<Integer> list = new ArrayList<>();
//        if (root == null) {
//            return list;
//        }
//        Deque<TreeNode> deque = new LinkedList<>();
//        TreeNode node = root;
//        while (!deque.isEmpty() || node != null) {
//            while (node != null) {
//                list.add(node.val);
//                deque.push(node);
//                node = node.left;
//            }
//            node = deque.pop();
//            node = node.right;
//        }
//        return list;
//    }
    
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            list.add(node.val);
            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
        }
        return list;
    }
}
