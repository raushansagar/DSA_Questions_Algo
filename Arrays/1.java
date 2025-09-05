
// Leetcode 1
// Link :- https://leetcode.com/problems/two-sum/
// Time complexity is O(n^2)
// Time complexity is O(1)

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;

        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                if(nums[i] + nums[j] == target){
                    return new int[] {i, j};
                }
            }
        }

        return new int[]{-1,-1};
    }
}



// Time complexity is O(n)
// Time complexity is O(n)

class Solution1{
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(target-nums[i])){
                return new int[]{map.get(target-nums[i]), i};
            }
            map.put(nums[i], i);
        }

        return new int[]{-1, -1};
    }
}