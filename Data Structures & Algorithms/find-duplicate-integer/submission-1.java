class Solution {
    public int findDuplicate(int[] nums) {
    Set<Integer> myset= new HashSet<>();

    for(int i =0 ; i<nums.length ; i++){
        if(myset.contains(nums[i])){
            return nums[i];
        }
        myset.add(nums[i]);
    }        
    return -1;
}}