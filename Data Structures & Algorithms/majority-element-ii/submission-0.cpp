class Solution {
public:
    vector<int> majorityElement(vector<int>& nums) {
        vector<int> res ;
        int n = nums.size();
        n=n/3 ; 
        unordered_map<int,int> m ; 

        for(int num : nums){
            m[num]++;
        }
        for(int num : nums){
            if(m[num]>n){
                res.push_back(num);
                m[num]=0;
            }
        }
        return res;
    }
};