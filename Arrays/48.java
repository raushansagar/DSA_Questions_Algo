
// Time complexity is O(n)
// Space Complexity is O(1)

class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        // Make Tanspose
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(i == j) break;
                // swap
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Revese Matrix
        for(int[] mat : matrix){
            int r = mat.length-1;
            int l = 0;

            while(l < r){
                // swap
                int temp = mat[l];
                mat[l] = mat[r];
                mat[r] = temp;

                l++;
                r--;
            }
        }
    }
}