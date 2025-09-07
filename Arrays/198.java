
// Leetcode 189
// link :- https://leetcode.com/problems/rotate-array/



// Time Complexity is 0(n);
// Space Complexity is 0(n)

class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] temp = new int[n];

        for(int i = 0; i < n; i++){
            int idx = (i+k)%n;
            temp[idx] = nums[i];
        }

        for(int i = 0; i < n; i++){
            nums[i] = temp[i];
        }
    }
}