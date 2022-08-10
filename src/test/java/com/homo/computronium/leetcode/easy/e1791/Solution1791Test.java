package com.homo.computronium.leetcode.easy.e1791;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution1791Test {

    @Test
    public void leetCodeCases() {
//        [[1,2],[2,3],[4,2]]

        Solution1791 solution = new Solution1791();

        int [][] edges = {
            {1, 2},
            {2, 3},
            {4, 2},
        };

        assertEquals(2, solution.findCenter(edges));
    }

}