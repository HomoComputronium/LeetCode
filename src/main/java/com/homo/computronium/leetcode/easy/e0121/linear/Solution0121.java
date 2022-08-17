package com.homo.computronium.leetcode.easy.e0121.linear;

import com.homo.computronium.leetcode.easy.e0121.IMaxProfit;

// 121. Best Time to Buy and Sell Stock
// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
public class Solution0121 implements IMaxProfit {

    public int maxProfit(int[] prices) {
        int highest = 0;
        int lowest = Integer.MAX_VALUE;
        int diff = 0;

        for (int i = prices.length - 1; i >= 0; i--) {
            int curr = prices[i];
            if (curr >= highest) {
                highest = curr;
                lowest = Integer.MAX_VALUE;
            } else {
                if (curr < lowest) {
                    lowest = curr;
                    diff = Math.max(diff, highest - lowest);
                }
            }
        }

        return diff;
    }
}
