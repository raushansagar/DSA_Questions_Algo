
// Leetcode 136
// Link :- https://leetcode.com/problems/single-number/
// Time complexity is O(n)
// Space complexity is O(1)

class Solution {
    public int singleNumber(int[] nums) {
        int xor = 0;

        for(int i = 0; i < nums.length; i++){
            xor ^= nums[i];
        }

        return xor;
    }
}