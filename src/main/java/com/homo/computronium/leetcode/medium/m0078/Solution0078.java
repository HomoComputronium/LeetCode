package com.homo.computronium.leetcode.medium.m0078;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// https://leetcode.com/problems/subsets/
// 78. Subsets
public class Solution0078 {

    private static final List<Integer> EMPTY_LIST = Collections.emptyList();

    public List<List<Integer>> subsets(int[] nums) {
        // todo provide calculated initial capacity
        List<List<Integer>> result = new ArrayList<>();
        result.add(EMPTY_LIST);

        for (int i = nums.length - 1; i >= 0; i--) {
            result.add(List.of(nums[i]));
            for (int j = i + 1; j < nums.length; j++) {
                int num = nums[j];
                result.add(List.of(nums[i], nums[j]));
                System.out.println("i: " + nums[i] + " j: " + num);
            }
        }

        return result;
    }
}
