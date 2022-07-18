package com.homo.computronium.leetcode.easy.the_k_weakest_rows_in_a_matrix.naive;

import java.util.Arrays;
import java.util.stream.IntStream;

// 1337. The K Weakest Rows in a Matrix
// https://leetcode.com/problems/the-k-weakest-rows-in-a-matrix/
public class Solution1337 {

    public int[] kWeakestRows(int[][] mat, int k) {
        int[] sortedSoldierNumArray = IntStream.range(0, mat.length)
                .mapToObj(i -> convertRowToSoldierCount2IndexArray(mat[i], i))
                .sorted(this::compareSoldierCount2IndexArrays)
                .map(arr -> arr[1])
                .mapToInt(Integer::intValue)
                .toArray();

        return Arrays.copyOfRange(sortedSoldierNumArray, 0, k);
    }

    public int compareSoldierCount2IndexArrays(int[] arr1, int[] arr2) {
        return (arr1[0] < arr2[0])
                ? -1
                : ((arr1[0] == arr2[0])
                    ? Integer.compare(arr1[1], arr2[1])
                    : 1);
    }

    public int[] convertRowToSoldierCount2IndexArray(int[] row, int index) {
        int[] soldierCount2IndexArray = new int[2];
        soldierCount2IndexArray[0] = countSoldiersNum(row);
        soldierCount2IndexArray[1] = index;
        return soldierCount2IndexArray;
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
