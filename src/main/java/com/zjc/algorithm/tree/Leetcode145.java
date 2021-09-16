package com.zjc.algorithm.tree;

import java.util.*;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2021/9/14
 * @description : 二叉树的后序遍历
 */
public class Leetcode145 {
    //递归
//    public List<Integer> postorderTraversal(TreeNode root) {
//        List<Integer> list = new ArrayList<>();
//        postOrder(root, list);
//        return list;
//    }
//
//    public void postOrder(TreeNode node, List<Integer> res) {
//        if (node == null) {
//            return;
//        }
//        postOrder(node.left, res);
//        postOrder(node.right, res);
//        res.add(node.val);
//    }
    
    //非递归
//    public List<Integer> postorderTraversal(TreeNode root) {
//        List<Integer> list = new ArrayList<>();
//        if (root == null) {
//            return list;
//        }
//        Deque<TreeNode> deque = new LinkedList<>();
//        TreeNode pre = null;
//        while (!deque.isEmpty() || root != null) {
//            while (root != null) {
//                deque.push(root);
//                root = root.left;
//            }
//            root = deque.pop();
//            if (root.right == null || root.right == pre) {
//                list.add(root.val);
//                pre = root;
//                root = null;
//            }else {
//                deque.push(root);
//                root = root.right;
//            }
//        }
//        return list;
//    }
    
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node  = stack.pop();
            list.add(node.val);
            if (node.left != null) {
                stack.push(node.left);
            }
            if (node.right != null) {
                stack.push(node.right);
            }
        }
        Collections.reverse(list);
        return list;
    }
}
