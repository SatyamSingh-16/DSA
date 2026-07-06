class Solution {
    public int maxProfit(int[] prices) {
       int maxp = Integer.MIN_VALUE;
       int minPrice = Integer.MAX_VALUE;

        for(int i = 0;i<prices.length;i++){
            minPrice = Math.min(minPrice,prices[i]);
            maxp = Math.max(maxp, prices[i] - minPrice);
        } 
        return maxp;
    }
}