class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
       List<Integer> sub = new ArrayList<>();
       Arrays.sort(candidates);
       dfs(0,candidates,sub,target,0);
       return res;

    }
    public void dfs (int i , int[] candidates , List<Integer> sub , 
     int target , int total){
        if(total == target){
            res.add(new ArrayList<>(sub));
            return ;
        }
        if(total>target || i>=candidates.length){
            return ;
        }

        sub.add(candidates[i]);
        dfs(i+1,candidates,sub,target,candidates[i]+total);
        sub.remove(sub.size()-1);
        while(i+1< candidates.length && candidates[i]==candidates[i+1] ){
            i++;
        }
        dfs(i+1,candidates,sub,target,total);    
     }
}
