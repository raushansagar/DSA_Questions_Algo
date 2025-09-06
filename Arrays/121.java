// Leetcode 121
// Link :- https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
// Time complexity is O(n)
// Space Complexity is O(1)

class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int buy = prices[0];

        for(int i = 0; i < prices.length; i++){
            if(prices[i] < buy){
                buy = prices[i];
            }

            profit = Math.max(profit, (prices[i]-buy));
        }

        return profit;
    }
}