package com.homo.computronium.leetcode.easy.e0088.manual;

import com.homo.computronium.leetcode.easy.e0088.MergeArrays;

public class Solution0088 implements MergeArrays {

    @Override
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        System.out.println("Manual merge solution");

        if (m == 0) {
            System.arraycopy(nums2, 0, nums1, 0, nums2.length);
            return;
        }

        int pointer1 = m - 1;
        int pointer2 = n - 1;
        int mergedPointer = m + n - 1;

        for (int i = 0; i < nums1.length; i++) {
            if (pointer2 < 0) {
                return;
            }
            if (pointer1 < 0) {
                nums1[mergedPointer] = nums2[pointer2];
                mergedPointer--;
                pointer2--;
                continue;
            }
            int value1 = nums1[pointer1];
            int value2 = nums2[pointer2];

            if (value1 >= value2) {
                nums1[mergedPointer] = value1;
                mergedPointer--;
                nums1[pointer1] = 0; // maybe it is not necessary
                pointer1--;
            } else {
                nums1[mergedPointer] = value2;
                mergedPointer--;
                nums2[pointer2] = 0; // maybe it is not necessary
                pointer2--;
            }
        }
    }
}
