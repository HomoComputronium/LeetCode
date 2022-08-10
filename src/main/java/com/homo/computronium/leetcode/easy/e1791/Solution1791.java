package com.homo.computronium.leetcode.easy.e1791;

// 1791. Find Center of Star Graph
// https://leetcode.com/problems/find-center-of-star-graph/
public class Solution1791 {

    public int findCenter(int[][] edges) {
        int[] firstEdge = edges[0];
        int[] secondEdge = edges[1];

        return findCommonInt(firstEdge, secondEdge);
    }

    private int findCommonInt(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            int firstArrValue = arr1[i];
            for (int j = 0; j < arr1.length; j++) {
                int secondArrValue = arr2[j];
                if (firstArrValue == secondArrValue) {
                    return firstArrValue;
                }
            }
        }
        return -1;
    }
}
