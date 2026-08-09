class Solution {
public:
    void setZeroes(vector<vector<int>>& matrix) {
        int row = matrix.size();
        int cols = matrix[0].size();
        vector<bool> rowZero(row,false);
        vector<bool> colZero(cols,false);
        for(int r =0 ; r<row ; r++){
            for(int c = 0 ; c<cols ; c++){
                if(matrix[r][c]==0){
                    rowZero[r]=true;
                    colZero[c]=true;
                }
            }
        }
        for(int r = 0 ; r<row ; r++){
            for(int c = 0 ; c<cols;c++){
                if(rowZero[r]==true || colZero[c]==true){
                    matrix[r][c]=0;
                }
            }
        }
    }
};
