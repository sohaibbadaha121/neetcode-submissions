class Solution {
public:
    vector<int> getConcatenation(vector<int>& nums) {
        vector<int> first ;
        for(int num : nums){
            first.push_back(num);
        }
        for(int num : nums){
            first.push_back(num);
        }
        return first;
    }
};