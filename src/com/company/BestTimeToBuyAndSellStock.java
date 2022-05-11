package com.company;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] prices = {7, 6, 4, 3, 1};
        BestTimeToBuyAndSellStock bestTimeToBuyAndSellStock = new BestTimeToBuyAndSellStock();
        int res = bestTimeToBuyAndSellStock.maxProfit(prices);
        System.out.println(res);
    }

    public int maxProfit(int[] prices) {
        if (prices.length <= 1) {
            return 0;
        }
        int min = prices[0];
        int maxp = 0;
        for (int i = 0; i < prices.length; i++) {
            min = Math.min(min, prices[i]);
            maxp = Math.max(maxp, prices[i] - min);
        }

        return maxp;
    }
}
