class Solution {
    private int ROWS , COLS;
    private Set<Pair<Integer,Integer>> path = new HashSet<>();
    public boolean exist(char[][] board, String word) {
        ROWS = board.length;
        COLS= board[0].length;
        for(int r = 0 ; r<ROWS ; r ++){
            for(int c=0 ; c < COLS ; c++){
                if(dfs(r,c,0,board,word)){
                    return true ; 
                }

            }

        }
        return false; 
    }


    public boolean dfs(int r , int c , int i ,
     char [][] board , String word){    
        // what is the base case ? -> when we reach last the word and we dont return false

        if(i==word.length()){
            return true ;
        }

        if(r<0 || c < 0 || r >= board.length 
        || c >= board[0].length || board[r][c] != word.charAt(i)
        || path.contains(new Pair<>(r,c))){
            return false ;
        }

        path.add(new Pair<>(r,c));

        boolean res = dfs(r+1, c , i+1,board,word) || dfs(r,c+1 , i+1,board,word)
        || dfs(r-1,c,i+1,board,word) || dfs(r,c-1,i+1,board,word);

        path.remove(new Pair<>(r,c));

        return res;

     }
}
