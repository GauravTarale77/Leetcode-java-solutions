class Solution {
    public int maxProfit(int[] prices) {
        int buyPrice = prices[0];
        int maxProfit = 0;

        for(int i = 1; i<prices.length; i++){
            if(buyPrice < prices[i]){
                maxProfit = Math.max(maxProfit, prices[i] - buyPrice);
            }else{
                buyPrice = prices[i];
            }
        }
        int profit = 0;
        for(int i = 1; i<prices.length; i++){
            if(prices[i-1] < prices[i]){
                profit += prices[i] - prices[i-1];
                maxProfit = Math.max(maxProfit, profit);
            }
        }
        return maxProfit;
    }
}