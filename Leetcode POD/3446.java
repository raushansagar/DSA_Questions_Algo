
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