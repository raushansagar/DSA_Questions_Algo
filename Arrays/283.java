// Leetcode 283
// Link :- https://leetcode.com/problems/move-zeroes/
// Time Complexity is 0(n)
// Space Complexity is 0(1)

class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int idx = 0;

        for(int i = 0; i < n; i++){
            if(nums[i] != 0){
                nums[idx++] = nums[i];
            }
        }

        while(idx < n){
            nums[idx++] = 0;
        }
    }
}