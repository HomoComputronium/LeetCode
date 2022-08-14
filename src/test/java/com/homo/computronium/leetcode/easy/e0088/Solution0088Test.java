package com.homo.computronium.leetcode.easy.e0088;

import com.homo.computronium.leetcode.easy.e0088.naive.Solution0088;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution0088Test {

    @Test
    void testNaiveSolution() {
        MergeArrays naiveSolution = new Solution0088();
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};

        int m = 3, n = 3;

        int[] expected = {1,2,2,3,5,6};

        naiveSolution.merge(nums1, m, nums2, n);
        assertArrayEquals(expected, nums1);
    }

    @Test
    void testQueueSolution() {
        MergeArrays naiveSolution = new com.homo.computronium.leetcode.easy.e0088.queue.Solution0088();
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};

        int m = 3, n = 3;

        int[] expected = {1,2,2,3,5,6};

        naiveSolution.merge(nums1, m, nums2, n);
        assertArrayEquals(expected, nums1);
    }

    @Test
    void testManualSolution() {
        MergeArrays manualSolution = new com.homo.computronium.leetcode.easy.e0088.manual.Solution0088();

        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};

        int m = 3, n = 3;

        int[] expected = {1,2,2,3,5,6};

        manualSolution.merge(nums1, m, nums2, n);
        assertArrayEquals(expected, nums1);
    }

    @Test
    void failedCase1() {
        MergeArrays manualSolution = new com.homo.computronium.leetcode.easy.e0088.manual.Solution0088();

        int[] nums1 = {0};
        int[] nums2 = {1};

        int m = 0, n = 1;

        int[] expected = {1};

        manualSolution.merge(nums1, m, nums2, n);
        assertArrayEquals(expected, nums1);

    }

    @Test
    void failedCase2() {
        MergeArrays manualSolution = new com.homo.computronium.leetcode.easy.e0088.manual.Solution0088();

        int[] nums1 = {2,0};
        int[] nums2 = {1};

        int m = 1, n = 1;

        int[] expected = {1,2};

        manualSolution.merge(nums1, m, nums2, n);
        assertArrayEquals(expected, nums1);

    }

    @Test
    void failedCase3() {
        MergeArrays manualSolution = new com.homo.computronium.leetcode.easy.e0088.manual.Solution0088();

        int[] nums1 = {4,5,6,0,0,0};
        int[] nums2 = {1,2,3};

        int m = 3, n = 3;

        int[] expected = {1,2,3,4,5,6};

        manualSolution.merge(nums1, m, nums2, n);
        assertArrayEquals(expected, nums1);
    }

}