package com.homo.computronium.leetcode.easy.reduce_number_to_zero;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution1342Test {

    @Test
    public void testLeetCodeCases() {
        Solution1342 solution = new Solution1342();

        assertEquals(6, solution.numberOfSteps(14));
        assertEquals(4, solution.numberOfSteps(8));
        assertEquals(12, solution.numberOfSteps(123));
    }

}