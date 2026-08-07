class Solution {
public:
    int rob(vector<int>& nums) {
       // [rob1 , rob2 , n , n+1];
       int rob1 = 0 ; 
       int rob2 = 0;
       for(int n : nums){
        int maxRob = max(rob1+n , rob2);
        rob1=rob2;
        rob2=maxRob;
       }
       return rob2;
    }
};
