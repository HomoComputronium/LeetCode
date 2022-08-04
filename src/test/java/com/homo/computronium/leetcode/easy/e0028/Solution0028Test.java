package com.homo.computronium.leetcode.easy.e0028;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution0028Test {

    @Test
    public void testLeetCodeCases() {
        Solution0028 solution = new Solution0028();

        assertEquals(2, solution.strStr("hello", "ll"));
        assertEquals(-1, solution.strStr("aaaaa", "bba"));
    }
}