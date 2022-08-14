package com.homo.computronium.leetcode.easy.e0088.naive;

import com.homo.computronium.leetcode.easy.e0088.MergeArrays;

import java.util.Arrays;

// https://leetcode.com/problems/merge-sorted-array/
// 88. Merge Sorted Array
public class Solution0088 implements MergeArrays {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        System.out.println("Naive solution");
        for (int i = 0; i < nums2.length; i++) {
            nums1[m + i] = nums2[i];
        }
        Arrays.sort(nums1);
    }
}
