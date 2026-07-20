class Solution {
    private List<String> res = new ArrayList<>();
    private HashMap<Integer,String> digitToChar = new HashMap<>();

    public List<String> letterCombinations(String digits) {
        
        digitToChar.put( 2, "abc");
        digitToChar.put( 3 , "def");
        digitToChar.put( 4 , "ghi");
        digitToChar.put( 5 , "jkl");
        digitToChar.put( 6 , "mno");
        digitToChar.put( 7 , "pqrs");
        digitToChar.put( 8 , "tuv");
        digitToChar.put( 9 , "wxyz");

        if(digits.isEmpty()){
            return res;
        }
        dfs(0,"",digits);
        return res ;

}
    public void  dfs(int i , String curS , String digits){
        if(curS.length()==digits.length()){
            res.add(curS);
            return;
        }

        String str = digitToChar.get(digits.charAt(i) - '0');
        for(char c : str.toCharArray()){
            dfs(i+1, curS + c , digits);
        }

    }
}