class Solution {
    public int search(int[] nums, int target) {
        int l = 0 ; 
        int r = nums.length -1 ; 

        while (l<=r){
            
            int m = (r+l) /2 ;

            if(nums[m] == target){
                return m;
            }

            // we need to check if the mid in the first or in the secound side 
            if(nums[m] >= nums[l]){
                if(nums[l] > target || target > nums[m]){
                    l = m + 1 ;
                }
                else {
                    r = m - 1;
                }

            } else {

                if (target > nums[r] || target < nums[m]){
                    r= m -1; 
                }
                else {
                    l = m +1 ;
                }
            }
            

        }
        return - 1;
    }
}
