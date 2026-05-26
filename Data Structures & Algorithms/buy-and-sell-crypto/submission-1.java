class Solution {
    public int maxProfit(int[] prices) {
        int l = 0 ;
        int r =1 ;
        int maxprofit=0;
        while(r<prices.length){
            // is profit ? 
            if(prices[l]<prices[r]){
                int profit = prices[r]-prices[l];
                maxprofit=Math.max(profit,maxprofit);
            }
            // not a profit so we need to move the l to be on the right 
            else{
            l =r ;
            }
            r ++;
        }
        return maxprofit;
    }
}
