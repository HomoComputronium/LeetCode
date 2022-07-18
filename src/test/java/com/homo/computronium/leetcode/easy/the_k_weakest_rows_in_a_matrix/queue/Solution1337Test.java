package com.homo.computronium.leetcode.easy.the_k_weakest_rows_in_a_matrix.queue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution1337Test {

    @Test
    public void testLeetCodeCase1() {
        Solution1337 solution = new Solution1337();

        int[][] mat = new int[][] {
                new int[] {1,0,0,0},
                new int[] {1,1,1,1},
                new int[] {1,0,0,0},
                new int[] {1,0,0,0}
        };
        int k = 2;
        int[] expected = {0, 2};

        int[] result = solution.kWeakestRows(mat, k);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testLeetCodeCase2() {
        Solution1337 solution = new Solution1337();

        int[][] mat = new int[][] {
                new int[] {1,1,0,0,0},
                new int[] {1,1,1,1,0},
                new int[] {1,0,0,0,0},
                new int[] {1,1,0,0,0},
                new int[] {1,1,1,1,1}
        };
        int k = 3;
        int[] expected = {2,0,3};

        int[] result = solution.kWeakestRows(mat, k);
        assertArrayEquals(expected, result);
    }

}