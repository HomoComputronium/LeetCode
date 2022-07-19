package com.homo.computronium.leetcode.easy.the_k_weakest_rows_in_a_matrix.naive;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class Solution1337Test {

    @Test
    public void testCountSoldiersNum() {
        Solution1337 solution = new Solution1337();

        int[] intArray1 = {1, 1, 0};
        assertEquals(2, solution.countSoldiersNum(intArray1));
    }

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

    @Test
    void playground() {
        int result = (175 << 20) + 99;
        System.out.println(result);

        int unresult = result >> 20;
        System.out.println(unresult);


        int somePower = result + 99;

        double log = Math.log(somePower);
        int to20 = 1048576;

        System.out.println("Division: " + somePower / to20);
        System.out.println("Remainder: " + getIndex(somePower));

        System.out.println("Log: " + log);
        System.out.println("Power: " + calculatePower(somePower));
    }

    private static int calculatePower(int number) {
        double log = Math.log(number) / Math.log(2);
        System.out.println("Actual: " + log);
        return (int) Math.round(log);
    }

    public int getIndex(int number) {
        int soldierNumber = number / 1048576;

        return number - (soldierNumber * 1048576);
    }

}