// Leetcode 560
// Link :- https://leetcode.com/problems/subarray-sum-equals-k/
// Time Complexity O(n)
// Space Complexity O(n)



import java.util.*;
class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int cumSum = 0;
        int noOfSubArray = 0;

        for(int i = 0; i < n; i++){
            cumSum += nums[i];

            if(map.containsKey(cumSum-k)){
                noOfSubArray += map.get((cumSum-k));
            }
            map.put(cumSum, map.getOrDefault(cumSum, 0) + 1);
        }

        return noOfSubArray;
    }
}