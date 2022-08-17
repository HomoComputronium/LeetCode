package com.homo.computronium.leetcode.easy.e0125;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Solution0125Test {

    @Test
    void regexWay() {
        IsPalindrome solution = new com.homo.computronium.leetcode.easy.e0125.regex.Solution0125();
        leetCodeCase(solution);
    }

    @Test
    void manualWay() {
        IsPalindrome solution = new com.homo.computronium.leetcode.easy.e0125.manual.Solution0125();
        leetCodeCase(solution);
    }

    @Test
    void arrayWay() {
        IsPalindrome solution = new com.homo.computronium.leetcode.easy.e0125.array.Solution0125();
        leetCodeCase(solution);
    }

    void leetCodeCase(IsPalindrome solution) {
        assertTrue(solution.isPalindrome("A man, a plan, a canal: Panama"));
        assertTrue(solution.isPalindrome(" "));
        assertFalse(solution.isPalindrome("race a car"));
    }
}