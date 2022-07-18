package com.homo.computronium.leetcode.easy.the_k_weakest_rows_in_a_matrix.queue;

import java.util.PriorityQueue;

public class Solution1337 {

    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<Pair> queue = new PriorityQueue<>(mat.length);

        for (int i = 0; i < mat.length; i++) {
            Pair pair = new Pair(countSoldiersNum(mat[i]), i);
            queue.add(pair);
        }

        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            Pair pair = queue.poll();
            result[i] = pair.getRight();
        }

        return result;
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

    public static class Pair implements Comparable<Pair> {
        private final int left;
        private final int right;

        public Pair(int left, int right) {
            this.left = left;
            this.right = right;
        }

        public int getLeft() {
            return left;
        }

        public int getRight() {
            return right;
        }

        @Override
        public int compareTo(Pair other) {
            return (this.left < other.getLeft())
                    ? -1
                    : ((this.left == other.getLeft())
                        ? Integer.compare(this.right, other.getRight())
                        : 1);
        }
    }
}
