package com.homo.computronium.leetcode.easy.e0094.naive;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

// https://leetcode.com/problems/binary-tree-inorder-traversal/
// 94. Binary Tree Inorder Traversal
public class Solution0094 {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> valueList = new ArrayList<>();
        if (Objects.nonNull(root)) {
            inorderTraversal(root.left, valueList);
            valueList.add(root.val);
            inorderTraversal(root.right, valueList);
        }
        return valueList;
    }

    private List<Integer> inorderTraversal(TreeNode root, List<Integer> valueList) {
        if (Objects.nonNull(root)) {
            inorderTraversal(root.left, valueList);
            System.out.println(root.val);
            valueList.add(root.val);
            inorderTraversal(root.right, valueList);
        }
        return valueList;
    }
}
