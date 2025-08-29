
// GFG Largest Element in Array
// link https://www.geeksforgeeks.org/problems/largest-element-in-array4009/1
// Time complexity is 0(n)


import java.util.*;
class Num{
    public static int largest(int[] arr) {
        int max = Integer.MIN_VALUE;
        
        for(int i = 0; i < arr.length; i++){
            max = Math.max(max, arr[i]);
        }
        
        return max;
    }
}
