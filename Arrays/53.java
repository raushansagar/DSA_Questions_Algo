
// Leetcode 53
// Link :- https://leetcode.com/problems/maximum-subarray/
// Time Complexity is O(n)
// Tiem Complexity is O(1)

class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            sum += nums[i];

            maxSum = Math.max(maxSum, sum);
            if(sum < 0){
                sum = 0;
            }
        }

        return maxSum;
    }
}