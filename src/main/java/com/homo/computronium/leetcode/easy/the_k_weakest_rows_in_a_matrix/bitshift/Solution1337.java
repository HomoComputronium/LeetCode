package com.homo.computronium.leetcode.easy.the_k_weakest_rows_in_a_matrix.bitshift;

import java.util.Arrays;

public class Solution1337 {
    private final static int BITSHIFT_POSITIONS = 11;
    private final static int DIVISOR = (int) Math.pow(2, BITSHIFT_POSITIONS);

    public int[] kWeakestRows(int[][] mat, int k) {
        int[] allBitshiftConvertedNumbers = new int[mat.length];

        for (int i = 0; i < mat.length; i++) {
            allBitshiftConvertedNumbers[i] = (countSoldiersNum(mat[i]) << BITSHIFT_POSITIONS) + i;
        }

        Arrays.sort(allBitshiftConvertedNumbers);

        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = getIndex(allBitshiftConvertedNumbers[i]);
        }

        return  result;
    }

    public int getIndex(int number) {
        int soldierNumber = number / DIVISOR;
        return number - (soldierNumber * DIVISOR);
    }

    public int countSoldiersNum(int[] row) {
        int count = 0;
        for (int i = 0; i < row.length; i++) {
            if (row[i] == 1) {
                count++;
            }
            if (row[1] == 0) {
                break;
            }
        }
        return count;
    }
}
