// Leetcode 3sum


import java.util.*;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        Set<List<Integer>> st = new HashSet<>();

        int i = 0;
        while(i < n){
            int j = i+1;
            int k = n-1;

            while(j < k){

                if(nums[i] + nums[j] + nums[k] == 0){
                    st.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                }
                else if(nums[i] + nums[j] + nums[k] > 0){
                    k--;
                }
                else{
                    j++;
                }
            }
            i++;
        }

        for(List<Integer> l : st){
            result.add(new ArrayList<>(l));
        }

        return result;
    }
}