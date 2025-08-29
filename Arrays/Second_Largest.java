
// GFG Second Largest
// link :- https://www.geeksforgeeks.org/problems/second-largest3735/1
// Time complexity is 0(n)


import java.util.*;
class Solution{
    public int getSecondLargest(int[] arr) {
        int n = arr.length;
        
        int first = 0;
        int second = 0;
        
        for(int i = 0; i < n; i++){
            if(first < arr[i]){
                second = first;
                first = arr[i];
            }
            else if(second < arr[i] && first > arr[i]){
                second = arr[i];
            }
        }
        
        
        return second == 0 ? -1 : second;
    }
}