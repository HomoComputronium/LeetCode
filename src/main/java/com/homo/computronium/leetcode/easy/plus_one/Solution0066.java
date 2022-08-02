package com.homo.computronium.leetcode.easy.plus_one;

import java.util.Arrays;

// 66. Plus One
// https://leetcode.com/problems/plus-one/
public class Solution0066 {

    public int[] plusOne(int[] digits) {
        int length = digits.length;
        if (hasOnlyNines(digits)) {
            return handleAllNines(length);
        }
        if (digits[length - 1] != 9) {
            return changeSingleDigit(digits, 0);
        }
        return severalNinesCases(digits, 0);
    }

    private int[] handleAllNines(int length) {
        int[] largeArr = new int[length + 1];
        Arrays.fill(largeArr, 0);
        largeArr[0] = 1;
        return largeArr;
    }

    private int[] severalNinesCases(int[] digits, int i) {
        if (digits[digits.length - 1 - i] == 9) {
            digits[digits.length - 1 - i] = 0;
            return severalNinesCases(digits, ++i);
        }
        return changeSingleDigit(digits, i);
    }

    private int[] changeSingleDigit(int[] digits, int i) {
        int lastDigitValue = digits[digits.length - 1 - i];
        digits[digits.length - 1 - i] = lastDigitValue + 1;
        return digits;
    }

    private boolean hasOnlyNines(int[] digits) {
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] != 9) {
                return false;
            }
        }
        return true;
    }
}
