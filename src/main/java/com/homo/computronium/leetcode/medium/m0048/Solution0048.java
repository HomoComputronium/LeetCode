package com.homo.computronium.leetcode.medium.m0048;


// https://leetcode.com/problems/rotate-image/
// 48. Rotate Image
public class Solution0048 {

    private int len;
    public void rotate(int[][] matrix) {
        len = matrix.length;

        int middle = len / 2;

        for (int j = 0; j < middle; j++) {
            // rotate one row
            for (int i = j; i < len - 1 - j; i++) {
                Point currPoint = new Point(i, j);
                rotate4RelatedCells(matrix, currPoint);
            }
        }
    }

    private void rotate4RelatedCells(int[][] matrix, Point currPoint) {
        int currValue = getValue(matrix, currPoint);
        if (currValue == 6) {
            System.out.println();
        }
        Point nextPoint;
        int nextValue;
        for (int i = 0; i < 4; i++) {
            nextPoint = rotatePoint(currPoint);
            nextValue = getValue(matrix, nextPoint);
            setValue(matrix, nextPoint, currValue);

            currValue = nextValue;
            currPoint = nextPoint;
        }
    }

    private int getValue(int[][] matrix, Point point) {
        return matrix[point.getY()][point.getX()];
    }

    private void setValue(int[][] matrix, Point point, int value) {
        matrix[point.getY()][point.getX()] = value;
    }

    private Point rotatePoint(Point point) {
        int x = point.getX();
        int y = point.getY();

        int rotatedY = x;
        int rotatedX = len -1 - y;

        return point.setX(rotatedX)
                .setY(rotatedY);
    }

    public static class Point {
        private int x;
        private int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public Point setX(int x) {
            this.x = x;
            return this;
        }

        public Point setY(int y) {
            this.y = y;
            return this;
        }
    }
}
