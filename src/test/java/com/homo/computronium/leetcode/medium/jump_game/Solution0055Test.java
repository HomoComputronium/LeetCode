package com.homo.computronium.leetcode.medium.jump_game;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution0055Test {

    @Test
    public void testLeetCodeCases() {
        Solution0055 solution = new Solution0055();

        int[] array1 = {2, 3, 1, 1, 4};
        assertTrue(solution.canJump(array1));

        int[] array2 = {3, 2, 1, 0, 4};
        assertFalse(solution.canJump(array2));

        int[] array3 = {2, 0};
        assertTrue(solution.canJump(array3));

        int[] array4 = {8,2,4,4,4,9,5,2,5,8,8,0,8,6,9,1,1,6,3,5,1,2,6,6,0,4,8,6,0,3,2,8,7,6,5,1,7,0,3,4,8,3,5,9,0,4,0,1,0,5,9,2,0,7,0,2,1,0,8,2,5,1,2,3,9,7,4,7,0,0,1,8,5,6,7,5,1,9,9,3,5,0,7,5};
        assertFalse(solution.canJump(array4));

        int[] array5 = {2,0,6,9,8,4,5,0,8,9,1,2,9,6,8,8,0,6,3,1,2,2,1,2,6,5,3,1,2,2,6,4,2,4,3,0,0,0,3,8,2,4,0,1,2,0,1,4,6,5,8,0,7,9,3,4,6,6,5,8,9,3,4,3,7,0,4,9,0,9,8,4,3,0,7,7,1,9,1,9,4,9,0,1,9,5,7,7,1,5,8,2,8,2,6,8,2,2,7,5,1,7,9,6};
        assertFalse(solution.canJump(array5));

        int[] array6 = {1, 1, 1, 1, 0, 0, 0, 1};
        assertFalse(solution.canJump(array6));

        int[] array7 = {2,0,6,9,8,4,5,0,8,9,1,2,9,6,8,8,0,6,3,1,2,2,1,2,6,5,3,1,2,2,6,4,2,4,3,0,0,0,3,8};
        assertFalse(solution.canJump(array7));

        int[] array8 = {6,4,2,4,3,0,0,0,3,8};
        assertFalse(solution.canJump(array8));

    }

    @Test
    public void hasArrayZeroUnjumpableGaps() {
        Solution0055 solution = new Solution0055();

        int[] arr = {1, 3, 2, 1, 0, 0, 7};
        boolean isUnjumpable = solution.hasArrayZeroUnjumpableGaps(arr);
        System.out.println("{1, 3, 2, 1, 0, 0, 7} isUnjumpable? " + isUnjumpable);

        int[] array3 = {2, 0};
        boolean isArray3Unjumpable = solution.hasArrayZeroUnjumpableGaps(array3);
        System.out.println("{2, 0} isUnjumpable? " + isArray3Unjumpable);
    }

    @Test
    public void testFailedCases() {
        Solution0055 solution = new Solution0055();

        int[] array1 = {2,0,0};
        assertTrue(solution.canJump(array1));
    }

}