package com.homo.computronium.leetcode.easy.e0121;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution0121Test {

    @Test
    void leetCodeCasesNaive() {
        IMaxProfit solution = new com.homo.computronium.leetcode.easy.e0121.naive.Solution0121();

        leetCodeCases(solution);
        trickyCase(solution);
        failedCases(solution);
    }

    @Test
    void leetCodeCasesLinear() {
        IMaxProfit solution = new com.homo.computronium.leetcode.easy.e0121.linear.Solution0121();

        leetCodeCases(solution);
        trickyCase(solution);
        failedCases(solution);
    }

    void leetCodeCases(IMaxProfit solution) {
        // [7,1,5,3,6,4]
        int [] array1 = {7,1,5,3,6,4};
        assertEquals(5, solution.maxProfit(array1));

        // [7,6,4,3,1]
        int [] array2 = {7,6,4,3,1};
        assertEquals(0, solution.maxProfit(array2));

        int[] array3 = {};
        assertEquals(0, solution.maxProfit(array3));
    }

    void trickyCase(IMaxProfit solution) {
        int [] array1 = {1, 9, 4, 7, 2, 5, 2, 3, 1};
        assertEquals(8, solution.maxProfit(array1));
    }

    void failedCases(IMaxProfit solution) {
        // [1,2]

        // [1,2]
        int [] array1 = {1,2};
        assertEquals(1, solution.maxProfit(array1));
    }
}