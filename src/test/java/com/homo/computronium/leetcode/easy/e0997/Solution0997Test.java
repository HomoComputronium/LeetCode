package com.homo.computronium.leetcode.easy.e0997;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Solution0997Test {

    @Test
    void testLeetCodeCases() {
        // [[1,2]]

        Solution0997 solution = new Solution0997();
        int [][] trust1 = {
            {1,2}
        };
        assertEquals(2, solution.findJudge(2, trust1));

//        [[1,3],[2,3]]
        int [][] trust2 = {
                {1,3},
                {2,3}
        };
        assertEquals(3, solution.findJudge(3, trust2));

        int [][] trust3 = {
                {1,3},
                {2,3},
                {3,1}
        };
        assertEquals(-1, solution.findJudge(3, trust3));

    }

    @Test
    void failedCases1() {

        Solution0997 solution = new Solution0997();
        int [][] trust2 = {
                {1,2},
                {2,3}
        };
        assertEquals(-1, solution.findJudge(3, trust2));

    }

    @Test
    void failedCases2() {
        Solution0997 solution = new Solution0997();

        int [][] trust2 = {};
        assertEquals(1, solution.findJudge(1, trust2));
    }

    @Test
    void failedCases3() {
        Solution0997 solution = new Solution0997();

        int [][] trust = {
                {1,3},
                {1,4},
                {2,3}
        };
        assertEquals(-1, solution.findJudge(4, trust));
    }

}