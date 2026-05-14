class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int nurows= matrix.length;
        int nucol= matrix[0].length;
        int top = 0 ; 
        int bot = nurows-1;

        while (top <= bot ){
            int row = (top + bot) / 2 ;
        
            if (target > matrix[row][nucol-1]){
                top = row + 1 ;

            }
            else if (target < matrix[row][0]){
                bot = row -1 ;
            }

            else {
                break ;
            }
        }
        int row = (top + bot ) / 2 ;
        int l  = 0 ;
        int r =nucol-1;
        while (l <= r){
            int m = (l+r) / 2 ;
            if (matrix[row][m] > target ){
                r = m -1 ;
            }
            else if (matrix[row][m] < target){
                l = m + 1 ;
            }
            else {
                return true ;}
            
        }
           return false ;
    }

}
