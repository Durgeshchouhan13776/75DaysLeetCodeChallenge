class Solution {
    public int tribonacci(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return f(n,dp);
    }
    public int f(int idx,int[] dp){
        if(idx==0) return 0;
        if(idx==1||idx==2) return 1;

        if(dp[idx]!=-1) return dp[idx];

        return dp[idx] = f(idx-1,dp)+f(idx-2,dp)+f(idx-3,dp);
    }

}