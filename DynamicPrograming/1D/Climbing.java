

// 70. Climbing Stairs
// Solved
// Easy
// Topics
// premium lock icon
// Companies
// Hint
// You are climbing a staircase. It takes n steps to reach the top.
// Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?



import java.util.*;

// Top Down Approch
class Solution{
    public int solve(int n, int[] dp){
        if(n == 1) return 1;
        if(n == 2) return 2;

        if(dp[n] != -1){
            return dp[n];
        }

        return dp[n] = solve(n-1, dp) + solve(n-2, dp);
    }
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);

        return solve(n, dp);
    }
}


// Botton Up Approch
class Solution1{
    public int climbStairs(int n) {
        int[] dp = new int[n+2];
        Arrays.fill(dp, -1);
        dp[1] = 1;
        dp[2] = 2;

        for(int i = 3; i <= n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }


        return dp[n];
    }
}