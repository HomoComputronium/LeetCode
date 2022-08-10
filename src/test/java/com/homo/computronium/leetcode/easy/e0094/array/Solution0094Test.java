package com.homo.computronium.leetcode.easy.e0094.array;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution0094Test {

    @Test
    public void simpleTest() {
        Solution0094 solution = new Solution0094();

//             1
//            / \
//           2   3
//          / \
//         4   5
        TreeNode leafLeft = new TreeNode(4);
        TreeNode leafRight = new TreeNode(5);

        TreeNode right = new TreeNode(3);
        TreeNode left = new TreeNode(2, leafLeft, leafRight);
        TreeNode root = new TreeNode(1, left, right);

        List<Integer> expectedList = Arrays.asList(4, 2, 5, 1, 3);

        assertEquals(expectedList, solution.inorderTraversal(root));

    }

    @Test
    public void nullCheckTest() {
        Solution0094 solution = new Solution0094();
        TreeNode root = null;

        List<Integer> expectedList = List.of();

        assertEquals(expectedList, solution.inorderTraversal(root));
    }

    @Test
    public void leftNullCheckTest() {
        Solution0094 solution = new Solution0094();
        TreeNode root = new TreeNode(1, null, null);

        List<Integer> expectedList = List.of(1);

        assertEquals(expectedList, solution.inorderTraversal(root));
    }

}