package com.homo.computronium.leetcode.easy.e0088;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution0088Test {

    @Test
    void leetCodeCases() {
        Solution0088 solution = new Solution0088();
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};

        int m = 3, n = 3;

        int[] expected = {1,2,2,3,5,6};

        solution.merge(nums1, m, nums2, n);

        assertArrayEquals(expected, nums1);
    }

}