class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        List<String> part = new ArrayList<>();
        dfs(0,0,res,part,s);
        return res;
    }

    public void dfs(int i , int j , List<List<String>> res , List<String> part , String s){
        if(j>=s.length()){
            if(j==i){
                res.add(new ArrayList<>(part));
            }
            return;
        }

        if(isPal(s,i,j)){
            part.add(s.substring(i,j+1)); // [a]
            dfs(j+1,j+1,res,part,s);  // the next for a -> [b]
            part.remove(part.size()-1);
        }

        dfs(i,j+1,res,part,s);
    }

    public boolean isPal(String s , int i , int j){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;

            }
            i++;
            j--;

        } 
        return true;
    }

}
