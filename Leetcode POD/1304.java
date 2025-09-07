// Leetcode 1304
// Link :- https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/?envType=daily-question&envId=2025-09-07
// Time complexity is O(n)
// Space complexity is O(1)

class Solution {
    public int[] sumZero(int n) {
        if(n == 1) return new int[]{0};
        int[] result = new int[n];
        int sum = 0;

        for(int i = 1; i < n; i++){
            result[i-1] = i;
            sum += i;
        }

        result[n-1] = sum == 0 ? 1 : -sum;
        return result;
    }
}