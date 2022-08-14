package com.homo.computronium.leetcode.easy.e0088.queue;

import com.homo.computronium.leetcode.easy.e0088.MergeArrays;

import java.util.PriorityQueue;

public class Solution0088 implements MergeArrays {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        System.out.println("Queue solution");
        PriorityQueue<Integer> queue = new PriorityQueue<>(m + n);

        for (int i = 0; i < m; i++) {
            queue.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            queue.add(nums2[i]);
        }

        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = queue.poll();
        }
    }
}
