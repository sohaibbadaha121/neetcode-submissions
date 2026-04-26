class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> myset = new HashSet<>();
        for(int num : nums){
            myset.add(num);
        }
         int longest =0;
         for(int num : myset){
            if(!myset.contains(num -1)){
                int length =1;
                while(myset.contains(num +length)){
                    length ++;
                }
                longest =Math.max(longest,length);
            }
         }
        return longest;
    }
}
