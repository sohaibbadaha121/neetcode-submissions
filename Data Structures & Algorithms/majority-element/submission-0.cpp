class Solution {
public:
    int majorityElement(vector<int>& nums) {
        int res = 0;
        int maxE =0 ;
        unordered_map<int , int> count;
        for(int num : nums){
            count[num]++;
            if(count[num]>maxE){
                res = num;
                maxE = count[num];
            }
        }
         return res ;
    }
};