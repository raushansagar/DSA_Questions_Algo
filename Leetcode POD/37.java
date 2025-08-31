// Leetcode 37
// Link :- https://leetcode.com/problems/sudoku-solver/?envType=daily-question&envId=2025-08-31
// Time Complexity is (1)
// Space Complexity is (1)



class Solution {
    public boolean isValid(char[][] board, char val, int row, int col){

        for(int i = 0; i < 9; i++){
            if(board[i][col] == val) return false;
            if(board[row][i] == val) return false;
        }

        int start_i = (row/3) * 3;
        int start_j = (col/3) * 3;

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(board[start_i+i][start_j+j] == val) return false;
            }
        }

        return true;
    }
    public boolean solve(char[][] board){

        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(board[i][j] == '.'){

                    for(char k = '1'; k <= '9'; k++){
                        if(isValid(board, k, i, j)){
                            board[i][j] = k;
                            
                            // explore
                            if(solve(board)){
                                return true;
                            }

                            // backtrack
                            board[i][j] = '.';
                        }
                    }
                    return false;
                }
            }
        }


        return true;
    }
    public void solveSudoku(char[][] board) {
        solve(board);
    }
}