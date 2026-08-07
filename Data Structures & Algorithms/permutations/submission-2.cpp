class Solution {
    vector<vector<int>> res; 
public:
    vector<vector<int>> permute(vector<int>& nums) {
        vector<bool> pick(nums.size(),false);
        vector<int> sub;
        dfs(nums,sub,pick);
        return res ;
    }
    void dfs (vector<int> &nums , vector<int> & sub , vector<bool> &pick){
        if(sub.size()==nums.size()){
            res.push_back(sub);
            return ;
        }
        for(int i = 0 ; i <nums.size() ; i++){
            if(!pick[i]){
                sub.push_back(nums[i]);
                pick[i]=true;
                dfs(nums,sub,pick);
                sub.pop_back();
                pick[i]=false;
            }
        }
    }
};
