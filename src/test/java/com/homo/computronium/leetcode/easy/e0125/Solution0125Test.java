package com.homo.computronium.leetcode.easy.e0125;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Solution0125Test {

    @Test
    void leetCodeCase() {
        Solution0125 solution = new Solution0125();

        assertTrue(solution.isPalindrome("A man, a plan, a canal: Panama"));
        assertTrue(solution.isPalindrome(" "));
        assertFalse(solution.isPalindrome("race a car"));
    }
}