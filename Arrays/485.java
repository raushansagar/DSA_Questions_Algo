
// Leetcode 485
// Link :- https://leetcode.com/problems/max-consecutive-ones/
// Time complexity is O(n)
// Space complexity is o(1)


class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int count = 0;
        int max = -1;
        
        for(int i = 0; i < n; i++){
            if(nums[i] == 1){
                count++;
            }
            else{
                count = 0;
            }
            max = Math.max(max, count);
        }


        return max;
    }
}