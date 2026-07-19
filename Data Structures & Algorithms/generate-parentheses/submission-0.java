class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res  =  new ArrayList<>();
        StringBuilder str = new StringBuilder();
        backtrack(0,0,n,str,res);
        return res;    
    }
    public void backtrack(int closeN , int openN , int n,
      StringBuilder str 
    , List<String> res ){

        if(closeN == openN && openN== n){
            res.add(str.toString());
            return ;
        }
        if(openN<n){

            str.append("(");
            backtrack(closeN  , openN +1, n ,str , res);
            str.deleteCharAt(str.length()-1);

        }

        if(closeN < openN){
            str.append(")");
            backtrack(closeN +1 , openN , n ,str , res);
            str.deleteCharAt(str.length()-1);
        }







    }
}
