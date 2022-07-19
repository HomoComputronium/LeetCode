package com.homo.computronium.leetcode.easy.richest_customer_wealth.naive;

import java.util.Arrays;

// 1672. Richest Customer Wealth
// https://leetcode.com/problems/richest-customer-wealth/
public class Solution1672 {

    public int maximumWealth(int[][] accounts) {
        return Arrays.stream(accounts)
                .map(this::sumArray)
                .max(Integer::compareTo)
                .get();
    }

    private int sumArray(int[] arr) {
        return Arrays.stream(arr)
                .sum();
    }
}
