// Chocolate Distribution Problem
// GFG 
// Link :- https://www.geeksforgeeks.org/problems/chocolate-distribution-problem3825/1

import java.util.*;
class Solution{
    public int findMinDiff(ArrayList<Integer> arr, int m) {
        Collections.sort(arr); // O(nlog(n))
        int min = Integer.MAX_VALUE; // 0 (1)
        
        for(int i = m-1; i < arr.size(); i++){ // O(n-m+1) = O(n)
            int j = i-m+1;
            
            min = Math.min(min, Math.abs(arr.get(i)-arr.get(j))); //(1)
        }
        
        // over all time compexity is O(nlog(n))
        
        return min;
    }
}