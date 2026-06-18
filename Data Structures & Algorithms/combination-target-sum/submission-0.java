class Solution {

    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<Integer> subset = new ArrayList<>();
        bactracking(nums, subset, target, 0, 0);
        return res;
    }

    public void bactracking(int[] nums, List<Integer> subset,
                            int target, int i, int total) {

        if (total == target) {
            res.add(new ArrayList<>(subset));
            return;
        }

        if (total > target || i >= nums.length) {
            return;
        }
        subset.add(nums[i]);
        bactracking(nums, subset, target, i, total + nums[i]);
        subset.remove(subset.size() - 1);
        bactracking(nums, subset, target, i + 1, total);
    }
}