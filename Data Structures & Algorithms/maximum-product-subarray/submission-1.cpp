class Solution {
public:
    int maxProduct(vector<int>& nums) {
        int curMax = 1 ;
        int curMin = 1;
        int res= nums[0];
        for(int num : nums){
            int temp = curMax *num;
            curMax = max(max(temp , num*curMin ), num);
            curMin = min(min(temp,num*curMin),num);
            res = max(res,curMax);
        }
        return res;
    }
};
