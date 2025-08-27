
//Approach (Traverse and explore all possible paths + memoization)
//T.C : O(m*n)
//S.C : O(m*n)


class Solution {
    // directions: 4 diagonals
    int[][] directions = {{-1, -1}, {-1, 1}, {1, 1}, {1, -1}};
    int[] nextSequence = {2, 2, 0}; // mapping like in your C++ code
    int[][][][][] cache; // [r][c][dir][next][turns]
    int m, n;

    private int getMaxSegment(int r, int c, int[][] grid, int dir, int next, int turns) {
        // Out of bounds or wrong cell
        if (r < 0 || c < 0 || r >= m || c >= n || grid[r][c] != next) {
            return 0;
        }

        if (cache[r][c][dir][next][turns] != -1) {
            return cache[r][c][dir][next][turns];
        }

        int result = 1 + getMaxSegment(
            r + directions[dir][0],
            c + directions[dir][1],
            grid,
            dir,
            nextSequence[next],
            turns
        );

        if (turns > 0) {
            int nextDir = (dir + 1) % 4; // rotate clockwise
            result = Math.max(result, 1 + getMaxSegment(
                r + directions[nextDir][0],
                c + directions[nextDir][1],
                grid,
                nextDir,
                nextSequence[next],
                turns - 1
            ));
        }

        return cache[r][c][dir][next][turns] = result;
    }

    public int lenOfVDiagonal(int[][] grid) {
        m = grid.length;
        n = grid[0].length;

        cache = new int[m][n][4][3][2];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int d = 0; d < 4; d++) {
                    for (int next = 0; next < 3; next++) {
                        Arrays.fill(cache[i][j][d][next], -1);
                    }
                }
            }
        }

        int result = 0;
        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                if (grid[r][c] == 1) {
                    for (int dir = 0; dir < 4; dir++) {
                        result = Math.max(result, getMaxSegment(r, c, grid, dir, 1, 1));
                    }
                }
            }
        }

        return result;
    }
}
