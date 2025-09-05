// Leetcode 169
// Link :- https://leetcode.com/problems/majority-element/
// Time complexity is O(n);
// Space Complexity is O(1)


class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int element = 0;

        for(int i = 0; i < nums.length; i++){
            if(count == 0){
                element = nums[i];
                count++;
            }
            else if(element == nums[i]){
                count++;
            }
            else{
                count--;
            }
        }


        return element;
    }
}