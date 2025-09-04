 
// Leetcode 53
// Maximum Subarray


class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int currSum = 0;
        int maxSubArraySum = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            currSum += nums[i];
            maxSubArraySum = Math.max(maxSubArraySum, currSum);

            if(currSum < 0) currSum = 0;
        }

        return maxSubArraySum;
    }
}