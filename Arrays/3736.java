// 3736. Minimum Moves to Equal Array Elements III

class Solution {
    public int minMoves(int[] nums) {
        int n = nums.length;
        int noOfOperations = 0;

        int max = 0;
        for(int i = 0; i < n; i++){
            max = Math.max(max, nums[i]);
        }

        for(int i = 0; i < n; i++){
            if(nums[i] == max) continue;
            noOfOperations += max-nums[i];
        }


        return noOfOperations;
    }
}