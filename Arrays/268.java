// Leetcode 268
// Link :- https://leetcode.com/problems/missing-number/
// Time complexity is O(1)


class Solution {
    public int missingNumber(int[] nums) {
        int xor = 0;
        int n = nums.length;

        for(int i = 0; i < n; i++){
            xor ^= nums[i];
        }

        for(int i = 0; i <= n; i++){
            xor ^= i;
        }

        return xor;
    }
}