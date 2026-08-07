class Solution {
public:
    vector<vector<int>> combinationSum(vector<int>& nums, int target) {
        vector<int> sub;
        vector<vector<int>> res;
        dfs(nums,target,sub,res,0);
        return res;
    }
    void dfs(vector<int> &nums , int target , vector<int> &sub , vector<vector<int>> &res , int i){
            if(target==0){
                res.push_back(sub);
                return ;
            }
            if(target<0 || i>=nums.size()){
                return ;
            }
        sub.push_back(nums[i]);
        dfs(nums,target-nums[i],sub,res,i);

        sub.pop_back();
        dfs(nums,target,sub,res,i+1);

    }
};
