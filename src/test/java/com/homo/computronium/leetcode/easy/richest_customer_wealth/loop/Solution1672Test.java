package com.homo.computronium.leetcode.easy.richest_customer_wealth.loop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution1672Test {

    @Test
    public void test() {
        Solution1672 solution = new Solution1672();

        int[][] accounts1 = new int[][] {
                new int[] {1,2,3},
                new int[] {3,2,1}
        };
        assertEquals(6, solution.maximumWealth(accounts1));

        int[][] accounts2 = new int[][] {
                new int[] {1,5},
                new int[] {7,3},
                new int[] {3,5}
        };
        assertEquals(10, solution.maximumWealth(accounts2));

        int[][] accounts3 = new int[][] {
                new int[] {2,8,7},
                new int[] {7,1,3},
                new int[] {1,9,5}
        };
        assertEquals(17, solution.maximumWealth(accounts3));
    }
}