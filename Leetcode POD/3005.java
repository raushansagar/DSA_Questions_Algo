// Leetcode 3005
// Time complexity O(n)
// Space Complextity (n)

class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] freq = new int[101];
        int maxFreq = 0;

        for(int val : nums){
            freq[val]++;
            maxFreq = Math.max(maxFreq, freq[val]);
        }

        int count = 0;
        for(int i = 0; i < 101; i++){
            if(freq[i] == 0) continue;
            if(maxFreq == freq[i]) count += freq[i];
        }

        return count;
    }
}






// Leetcode 3005
// Time complexity O(n)
// Space Complextity (1)

class Solution2 {
    public int maxFrequencyElements(int[] nums) {
        Arrays.sort(nums);
        int count = 1;
        int maxFreq = 1;
        int result = 0;

        for(int i = 1; i < nums.length; i++){
            if(nums[i-1] == nums[i]){
                count++;
            }
            else if(nums[i-1] != nums[i] && maxFreq == count){
                result += maxFreq;
                count = 1;
            }
            else if(nums[i-1] != nums[i] && maxFreq < count){
                result = count;
                maxFreq = Math.max(maxFreq, count);
                count = 1;
            }
            else{
                count = 1;
            }
        }

        if(maxFreq < count) return count;
        if(maxFreq == count){
            result += maxFreq;
        }

        return result;
    }
}