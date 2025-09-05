// Leetcode 75
// Link :- https://leetcode.com/problems/sort-colors/
// Time complexity is O(n)
// Space complexity is O(1)

class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int i = 0, j = 0, k = 0;

        while(k < n){

            if(nums[k] == 0 && nums[i] != 1){
                // swap
                int temp = nums[k];
                nums[k] = nums[i];
                nums[i] = temp;
                i++;
                j++;
            }
            else if(nums[k] == 1){
                // swap
                int temp = nums[k];
                nums[k] = nums[j];
                nums[j++] = temp;
            }
            else if(nums[k] == 0 && nums[i] == 1){
                // j pointer
                nums[k] = nums[j];
                nums[j++] = 1;
                nums[i++] = 0;
            }

            k++;
        }
    }
}