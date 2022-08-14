package com.homo.computronium.leetcode.medium.m0078;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Solution0078Test {

    @Test
    void emptyInput() {
        Solution0078 solution = new Solution0078();

        int[] nums = {};

        List<List<Object>> expected = List.of(Collections.emptyList());
        assertEquals(expected, solution.subsets(nums));
    }

    @Test
    void basicCase() {
        Solution0078 solution = new Solution0078();

        int[] nums = {0};

        List<Integer> emptyList = Collections.emptyList();
        List<List<Integer>> expected = Arrays.asList(
                emptyList,
                Arrays.asList(0)
        );

        assertEquals(expected, solution.subsets(nums));
    }

    @Test
    void arrayWithTwoValuesCase() {
        Solution0078 solution = new Solution0078();

        int[] nums = {1, 2};

        List<Integer> emptyList = Collections.emptyList();
        List<List<Integer>> expected = Arrays.asList(
                emptyList,
                Arrays.asList(2),
                Arrays.asList(1),
                Arrays.asList(1, 2)
        );

        assertEquals(expected, solution.subsets(nums));
    }

    @Test
    void arrayWithThreeValuesCase() {
        Solution0078 solution = new Solution0078();

        int[] nums = {1, 2, 3};
        solution.subsets(nums);
    }

}