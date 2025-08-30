// Leetcode 36
// link :- https://leetcode.com/problems/valid-sudoku/?envType=daily-question&envId=2025-08-30
// Time complexity o(n*m)


import java.util.*;

class Solution {
    private boolean check(int row, int col, char[][] board){
        Set<Character> st = new HashSet<>();

        for(int i = row; i < row+3; i++){
            for(int j = col; j < col+3; j++){
                if(board[i][j] == '.') continue;
                if(st.contains(board[i][j])){
                    return false;
                }
                st.add(board[i][j]);
            }
        }

        return true;
    }
    public boolean isValidSudoku(char[][] board) {
        int n = board.length;
        int m = board.length;

        // check row
        for(int i = 0; i < n; i++){
            Set<Character> st = new HashSet<>();
            for(int j = 0; j < m; j++){

                if(board[i][j] == '.') continue;
                if(st.contains(board[i][j])){
                    return false;
                }
                st.add(board[i][j]);
            }
        }

        // check col
        for(int i = 0; i < n; i++){
            Set<Character> st = new HashSet<>();
            for(int j = 0; j < m; j++){

                if(board[j][i] == '.') continue;
                if(st.contains(board[j][i])){
                    return false;
                }
                st.add(board[j][i]);
            }
        }

        // check 3 * 3
        for(int i = 0; i < n; i += 3){
            for(int j = 0; j < m; j += 3){
                if(!check(i, j, board)){
                    return false;
                }
            }
        }


        return true;
    }
}