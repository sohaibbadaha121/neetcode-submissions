class Solution {
public:
    int findDuplicate(vector<int>& nums) {
        int slow = 0 ;
        int fast = 0 ;
        for(;;){
            slow=nums[slow];
            fast = nums[nums[fast]];
            if(fast==slow){
                break;
            }
            }
            int slow2 = 0 ;
            for(;;){
                slow=nums[slow];
                slow2=nums[slow2];
                if(slow==slow2){
                    return slow;
                }
            }
        }
};
