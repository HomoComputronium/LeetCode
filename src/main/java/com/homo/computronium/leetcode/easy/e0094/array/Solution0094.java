package com.homo.computronium.leetcode.easy.e0094.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

// https://leetcode.com/problems/binary-tree-inorder-traversal/
// 94. Binary Tree Inorder Traversal
public class Solution0094 {

    public List<Integer> inorderTraversal(TreeNode root) {
        Integer[] valuesArr = null;
        if (Objects.nonNull(root)) {
            AtomicInteger nodeCount = new AtomicInteger(0);
            countNodes(root, nodeCount);
            valuesArr = new Integer[nodeCount.get()];
            AtomicInteger index = new AtomicInteger(0);
            inorderTraversal(root.left, valuesArr, index);
            valuesArr[index.getAndIncrement()] = root.val;
            inorderTraversal(root.right, valuesArr, index);
        }
        if (valuesArr == null) {
            return Collections.emptyList();
        }
        return Arrays.asList(valuesArr);
    }

    private void inorderTraversal(TreeNode root, Integer[] valuesArr, AtomicInteger index) {

        if (Objects.nonNull(root)) {
            inorderTraversal(root.left, valuesArr, index);
            valuesArr[index.getAndIncrement()] = root.val;
            inorderTraversal(root.right, valuesArr, index);
        }
    }

    private void countNodes(TreeNode root, AtomicInteger count) {
        if (Objects.nonNull(root)) {
            countNodes(root.left, count);
            count.incrementAndGet();
            countNodes(root.right, count);
        }
    }
}
