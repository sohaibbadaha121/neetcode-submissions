class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
    
    int nRows = matrix.length; 
    int nCols = matrix[0].length ;

    for(int i  =0 ; i< nRows ; i ++ ) {

        if(binarys(matrix[i] , target , nCols )){
            return true ; 
        }

    }
    return false ;

}
  private boolean binarys( int [] row , int target , int nCols ){

    int  l = 0 ; 
    int  r = nCols -1; 
    while(l<= r ) {
        int m = (r +l ) / 2 ;
        if(row[m] == target){
            return true  ;
        }
        else if (row[m] < target ){
            l = m +1;
        }
        else {
            r = m -1 ;
        }
    }
        return false ;
  }
}