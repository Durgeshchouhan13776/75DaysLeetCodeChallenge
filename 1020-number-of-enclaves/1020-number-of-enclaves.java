class Solution {
    public int numEnclaves(int[][] grid) {
        int count=0;
        int m =grid.length;
        int n =grid[0].length;

        int[][] vis = new int[m][n];
        int[] delrow = {-1,0,1,0};
        int[] delcol = {0,1,0,-1};
        for(int j=0; j<n; j++){
            if(grid[0][j]==1&& vis[0][j]==0){
                dfs(0,j,vis,grid,delrow,delcol);
            }
            if(grid[m-1][j]==1&& vis[m-1][j]==0){
                dfs(m-1,j,vis,grid,delrow,delcol);
            }
        }

        for(int i=0; i<m; i++){
            if(grid[i][0]==1 && vis[i][0]==0){
                dfs(i,0,vis,grid,delrow,delcol);
            }
            if(grid[i][n-1]==1 && vis[i][n-1]==0){
                dfs(i,n-1,vis,grid,delrow,delcol);
            }
        }

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(vis[i][j]==0&&grid[i][j]==1){
                    count++;
                }
            }
        }
        return count;
    }
    public void dfs(int row,int col,int[][] vis,int[][] grid,int[] delrow, int[] delcol ){
        vis[row][col] = 1;
        int m =grid.length;
        int n =grid[0].length;

        for(int i=0; i<4; i++){
            int nrow = row+delrow[i];
            int ncol = col+delcol[i];

            if(nrow>=0 && nrow<m&& ncol<n && ncol>=0 && vis[nrow][ncol]==0&&grid[nrow][ncol]==1){
                dfs(nrow,ncol,vis,grid,delrow,delcol);
            }
        }
    }
}