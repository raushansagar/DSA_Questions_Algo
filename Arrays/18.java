// Leetcode 18 
// 4Sum 



import java.util.*;
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<>();
        Set<List<Integer>> st = new HashSet<>();

        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                int left = j+1;
                int right = n-1;

                while(left < right){
                    long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];

                    if(sum == (long)target){
                        st.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        left++;
                    }
                    else if(nums[i] + nums[j] + nums[left] + nums[right] > target){
                        right--;
                    }
                    else{
                        left++;
                    }
                }
            }
        }

        for(List<Integer> l : st){
            result.add(new ArrayList<>(l));
        }

        return result;
    }
}