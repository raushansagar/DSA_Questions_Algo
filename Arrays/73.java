


class Solution {
    public void makeZero(int row, int col, int[][] matrix){
        int n = matrix.length;
        int m = matrix[0].length;

        // row
        for(int i = 0; i < n; i++){
            matrix[i][col] = 0;
        }

        // col
        for(int i = 0; i < m; i++){
            matrix[row][i] = 0;
        }
    }
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        Queue<int[]> pq = new LinkedList<>();

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(matrix[i][j] != 0) continue;
                pq.add(new int[]{i, j});
            }
        }

        while(!pq.isEmpty()){
            int[] temp = pq.remove();
            int i = temp[0];
            int j = temp[1];

            if(matrix[i][j] == 0){
                makeZero(i, j, matrix);
            }
        }
    }
}