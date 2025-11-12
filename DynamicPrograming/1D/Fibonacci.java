

import  java.util.*;

// Top down approch
class Solution1 {
    public int solve(int n, int[] memoization){
        if(n == 1) return 1;
        if(n == 0) return 0;

        if(memoization[n] != -1){
            return memoization[n];
        }

        return memoization[n] = solve(n-1, memoization) + solve(n-2, memoization);
    }
    public int fib(int n) {
        int[] memoization = new int[n+1];
        Arrays.fill(memoization, -1);

        return solve(n, memoization);
    }
}



// Botton Up Approch
class Solution2{
    public int fib(int n) {
        int[] dp = new int[n+2];
        Arrays.fill(dp, -1);

        dp[0] = 0;
        dp[1] = 1;

        for(int i = 2; i <= n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }


        return dp[n];
    }
}