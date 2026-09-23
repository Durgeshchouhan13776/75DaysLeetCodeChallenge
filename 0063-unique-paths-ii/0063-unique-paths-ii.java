class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        int[][] dp = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                dp[i][j] = -1;
            }
        }
      return  solve(obstacleGrid,0,0,dp);
    }
    public int solve(int[][] obstacleGrid, int i, int j,int[][] dp) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        
        if(i>m-1 || j>n-1 || obstacleGrid[i][j]==1){
            return 0;
        }
        if(dp[i][j]!=-1) return dp[i][j];

        if(i==m-1&&j==n-1){
            return 1;
        }
       
        int right = solve(obstacleGrid,i,j+1,dp);
        int left = solve(obstacleGrid,i+1,j,dp);

        return dp[i][j] = right+left;
    }
        
}