class Solution {
    public int lengthOfLongestSubsequence(List<Integer> nums, int target) {
        int[][] dp = new int[nums.size()][target+1];
        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++){
                dp[i][j] = -1;
            }
        }
        int ans = (int)solve(0,nums,target,dp);
        if(ans==Integer.MIN_VALUE) return -1;
        return ans;
    }
    public int solve(int i, List<Integer> nums, int target,int[][] dp){
        if(i==nums.size()){
            if(target==0) return 0;
            else return Integer.MIN_VALUE;
        }
        if(dp[i][target]!=-1) return dp[i][target];
        int skip = solve(i+1,nums,target,dp);
        if(target-nums.get(i)<0) return dp[i][target] = skip;
        int next = solve(i+1,nums,target-nums.get(i),dp);
        int pick = Integer.MIN_VALUE;
        if(next!=Integer.MIN_VALUE) {
            pick = 1+next;
        }
        return dp[i][target] = Math.max(pick,skip);
    }
}