class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int maxP = 0 ;
        int r = 1 ;
        int l = 0;
        while(r<prices.size()){
            if(prices[l]>prices[r]){
                l=r;
            }
           else{ int profet = prices[r]-prices[l];
            maxP=max(maxP,profet);
            }
            r++;
        }
        return maxP;
    }
};
