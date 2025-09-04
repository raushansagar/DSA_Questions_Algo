
// Leetcode 1752  
// Check if Array Is Sorted and Rotated
// Time complexity is 0(n)


class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int minIdx = 0;
        int maxIdx = 0;

        for(int i = 1; i < n; i++){
            if(nums[i-1] > nums[i]){
                maxIdx = i-1;
                minIdx = i;
            }
        }
        if(minIdx == maxIdx && n > 1) return true;

        for(int i = maxIdx-1; i >= 0; i--){
            if(nums[i] > nums[i+1]){
                return false;
            }
        }

        for(int i = minIdx+1; i < n; i++){
            if(nums[i-1] > nums[i]){
                return false;
            }
        }

        if(nums[0] < nums[n-1]) return false;
        return true;
    }
}
