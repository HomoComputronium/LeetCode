package com.homo.computronium.leetcode.easy.e0121.naive;

import com.homo.computronium.leetcode.easy.e0121.IMaxProfit;

public class Solution0121 implements IMaxProfit {

    public int maxProfit(int[] prices) {
        if (prices == null) {
            return 0;
        }
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            int benchmarkPrice = prices[i];
            for (int j = i + 1; j < prices.length; j++) {
                int otherPrice = prices[j];
                int currDiff = otherPrice - benchmarkPrice;
                maxProfit = Math.max(maxProfit, currDiff);
            }
        }

        return maxProfit;
    }
}
