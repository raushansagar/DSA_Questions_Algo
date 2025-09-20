// Leetcode 229 
// Majority elements ||
// Time complexity O(n)


import java.util.*;
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;

        int maj1 = Integer.MIN_VALUE;
        int maj2 = Integer.MIN_VALUE;
        int count1 = 0;
        int count2 = 0;

        // find mjority elements
        for(int i = 0; i < n; i++){
            if(nums[i] == maj1){
                count1++;
            }
            else if(nums[i] == maj2){
                count2++;
            }
            else if(count1 == 0){
                maj1 = nums[i];
                count1 = 1;
            }
            else if(count2 == 0){
                maj2 = nums[i];
                count2 = 1;
            }
            else{
                count1--;
                count2--;
            }
        }
        

        // verify the majority element
        List<Integer> result = new ArrayList<>();
        int freq1 = 0;
        int freq2 = 0;

        for(int i = 0; i < n; i++){
            if(maj1 == nums[i]) freq1++;
            if(maj2 == nums[i]) freq2++;
        }

        if(freq1 > n/3) result.add(maj1);
        if(freq2 > n/3) result.add(maj2);

        return result;
    }
}