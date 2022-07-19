package com.homo.computronium.leetcode.easy.richest_customer_wealth.loop;

// 1672. Richest Customer Wealth
// https://leetcode.com/problems/richest-customer-wealth/
public class Solution1672 {

    public int maximumWealth(int[][] accounts) {
        int biggest = 0;

        for (int i = 0; i < accounts.length; i++) {
            int[] account = accounts[i];
            int sum = sumArray(account);

            if (sum > biggest) {
                biggest = sum;
            }
        }

        return biggest;
    }

    private int sumArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
