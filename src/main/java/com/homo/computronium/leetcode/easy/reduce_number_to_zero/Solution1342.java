package com.homo.computronium.leetcode.easy.reduce_number_to_zero;

// 1342. Number of Steps to Reduce a Number to Zero
// https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
public class Solution1342 {

    public int numberOfSteps(int num) {
        int stepNum = 0;
        return numberOfSteps(num, stepNum);
    }

    private int numberOfSteps(int num, int stepNum) {
        if (num % 2 == 0 && num != 0) {
            num = num / 2;
            stepNum++;
            return numberOfSteps(num, stepNum);
        } else if (num == 0) {
            return stepNum;
        } else {
            num = num - 1;
            stepNum++;
            return numberOfSteps(num, stepNum);
        }
    }
}
