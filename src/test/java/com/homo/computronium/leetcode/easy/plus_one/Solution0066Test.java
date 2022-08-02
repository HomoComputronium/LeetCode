package com.homo.computronium.leetcode.easy.plus_one;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Solution0066Test {

    @Test
    public void testLeetCodeCases() {
        Solution0066 solution = new Solution0066();

        int[] inputDigits1 = {1, 2, 3};
        int[] outputDigits1 = {1, 2, 4};
        assertArrayEquals(outputDigits1, solution.plusOne(inputDigits1));

        int[] inputDigits2 = {4,3,2,1};
        int[] outputDigits2 = {4,3,2,2};
        assertArrayEquals(outputDigits2, solution.plusOne(inputDigits2));

        int[] inputDigits3 = {9};
        int[] outputDigits3 = {1,0};
        assertArrayEquals(outputDigits3, solution.plusOne(inputDigits3));
    }

    @Test
    public void testCornerCases() {
        Solution0066 solution = new Solution0066();

        int[] inputDigits1 = {3, 9, 9};
        int[] outputDigits1 = {4, 0, 0};
        assertArrayEquals(outputDigits1, solution.plusOne(inputDigits1));

        int[] inputDigits2 = {1,1,9};
        int[] outputDigits2 = {1,2,0};
        assertArrayEquals(outputDigits2, solution.plusOne(inputDigits2));
    }
}