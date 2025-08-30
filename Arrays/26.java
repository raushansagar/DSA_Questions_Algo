// Leetcode 26
// link :- https://leetcode.com/problems/remove-duplicates-from-sorted-array/
// Time complexity is 0(n)
// Space complexity is 0(1)

class Solution {
    public int removeDuplicates(int[] nums) {
        int idx = 0;

        for(int i = 1; i < nums.length; i++){
            if(nums[i-1] != nums[i]){
                idx++;
                nums[idx] = nums[i];
            }
        }


        return idx+1;
    }
}