package com.zjc.algorithm.tree;

import java.util.*;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2021/9/14
 * @description : 二叉树的中序遍历
 */
public class Leetcode94 {
//    public List<Integer> inorderTraversal(TreeNode root) {
//        List<Integer> list = new ArrayList<>();
//        inorder(root, list);
//        return list;
//    }
//
//    public void inorder(TreeNode node, List<Integer> list) {
//        if (node == null) {
//            return;
//        }
//        inorder(node.left, list);
//        list.add(node.val);
//        inorder(node.right, list);
//    }

//    public List<Integer> inorderTraversal(TreeNode root) {
//        List<Integer> list = new ArrayList<>();
//        Deque<TreeNode> deque = new LinkedList<>();
//        while (!deque.isEmpty() || root != null) {
//            while (root != null) {
//                deque.push(root);
//                root = root.left;
//            }
//            root = deque.pop();
//            list.add(root.val);
//            root = root.right;
//        }
//        return list;
//    }
    
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        while (cur != null || !stack.isEmpty()) {
            if (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }else {
                cur = stack.pop();
                list.add(cur.val);
                cur = cur.right;
            }
        }
        return list;
    }

}
