class Solution {
    public List<List<Integer>> subsets(int[] nums) {
         List<List<Integer>> res = new ArrayList<>();
         List<Integer> subset = new ArrayList<>();
        
        backtraking(nums ,0, subset,res );
        return res ;
    }

    public void backtraking (int [] nums , int i 
    , List<Integer> subset , List<List<Integer>> res){

        if(i>=nums.length){

            res.add(new ArrayList<>(subset));
            return ;
        }

        subset.add(nums[i]);
        backtraking(nums,i+1,subset,res); // [1,2,3]
        subset.remove(subset.size()-1) ; // [1,2]
        backtraking(nums,i+1,subset,res);

    }
}
