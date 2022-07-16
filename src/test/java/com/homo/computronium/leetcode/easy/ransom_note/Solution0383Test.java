package com.homo.computronium.leetcode.easy.ransom_note;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Solution0383Test {

    @Test
    public void testLeetCodeCases() {
        Solution0383 solution = new Solution0383();

        assertFalse(solution.canConstruct("a", "b"));
        assertFalse(solution.canConstruct("aa", "ab"));
        assertTrue(solution.canConstruct("aa", "aab"));
    }

}