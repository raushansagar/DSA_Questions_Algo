

// approch (1)
// time complexity of code is o(n*m * log Min(n*m))
import java.util.*;

class Solution {
    public int[][] sortMatrix(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        Map<Integer, Deque<Integer>> map = new HashMap<>();

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                int key = i-j;
                int val = grid[i][j];

                map.putIfAbsent(key, new ArrayDeque<>());
                map.get(key).add(val);
            }
        }


        for(int key : map.keySet()){
            List<Integer> list = new ArrayList<>(map.get(key));
            Collections.sort(list);

            map.put(key, new ArrayDeque<>(list));
        }


        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                int key = i-j;

                if(key >= 0){
                    grid[i][j] = map.get(key).pollLast();
                }
                else{
                    grid[i][j] = map.get(key).pollFirst();
                }
            }
        }


        return grid;
    }
}



// approch (2)
// time complexity is 0(n*n log(Min n*m))

class Solution2 {
    public void solve(int i, int j, int[][] grid, List<Integer> list, int n, int m){
        if(i < 0 || i >= n || j < 0 || j >= m){
            if((i-j) < 0){
                Collections.sort(list);
            }
            else{
                Collections.sort(list, Collections.reverseOrder());
            }
            return;
        }

        list.add(grid[i][j]);
        solve(i+1, j+1, grid, list, n, m);

        // backtrack
        grid[i][j] = list.get(list.size()-1);
        list.remove(list.size()-1);
    }
    public int[][] sortMatrix(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        

        // increasing order
        for(int i = 1; i < n; i++){
            List<Integer> list = new ArrayList<>();
            solve(0, i, grid, list, n, m);
        }

        // decreasing order
        for(int i = 0; i < n; i++){
            List<Integer> list = new ArrayList<>();
            solve(i, 0, grid, list, n, m);
        }


        return grid;
    }
}