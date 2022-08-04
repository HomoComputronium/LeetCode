package com.homo.computronium.leetcode.medium.m0048;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Solution0048Test {

    @Test
    public void simplestCase() {
        Solution0048 solution = new Solution0048();

        int [][] inputMatrix = new int[][] {
                new int [] {1, 2},
                new int [] {4, 3}
        };

        int [][] expectedMatrix = new int[][] {
                new int [] {4, 1},
                new int [] {3, 2}
        };

        solution.rotate(inputMatrix);
        assertTrue(Arrays.deepEquals(expectedMatrix, inputMatrix));

    }

    @Test
    public void matrix3Case() {
        Solution0048 solution = new Solution0048();

        int [][] inputMatrix = new int[][] {
                new int [] {1, 2, 3},
                new int [] {4, 5, 6},
                new int [] {7, 8, 9}
        };

        int [][] expectedMatrix = new int[][] {
                new int [] {7, 4, 1},
                new int [] {8, 5, 2},
                new int [] {9, 6, 3}
        };

        solution.rotate(inputMatrix);
        assertTrue(Arrays.deepEquals(expectedMatrix, inputMatrix));
    }

    @Test
    public void matrix4Case() {
        Solution0048 solution = new Solution0048();

        int [][] inputMatrix = new int[][] {
                new int [] {1, 2, 3, 4},
                new int [] {5, 6, 7, 8},
                new int [] {9, 10, 11, 12},
                new int [] {13, 14, 15, 16}
        };

        int [][] expectedMatrix = new int[][] {
                new int [] {13, 9,  5, 1},
                new int [] {14, 10, 6, 2},
                new int [] {15, 11, 7, 3},
                new int [] {16, 12, 8, 4}
        };

        solution.rotate(inputMatrix);
        assertTrue(Arrays.deepEquals(expectedMatrix, inputMatrix));
    }


}