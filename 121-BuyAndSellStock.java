class Solution {
    public int maxProfit(int[] prices) {
        int minBuy = prices[0];
        int max = 0;
        for(int i = 0; i< prices.length ; i++)
        {
            if(prices[i]<minBuy){
                minBuy = prices[i];
            }
            int profit = prices[i] - minBuy;
            if(profit>max){
                max=profit;
            }
            
        }return max;
        
    }
}