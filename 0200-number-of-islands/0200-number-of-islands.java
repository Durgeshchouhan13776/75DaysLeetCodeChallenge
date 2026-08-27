
class Solution {
    

      public static int numIslands(char[][] grid) {

        int m = grid.length;
        int n = grid[0].length;

        boolean[][] vis = new boolean[m][n];

        int count = 0;

        for (int i = 0; i < m; i++) {

            for (int j = 0; j < n; j++) {

                if (grid[i][j] == '1' && vis[i][j] == false) {

                    dfs(i, j, grid, vis);

                    count++;
                }
            }
        }

        return count;
    }
    public static void dfs(int i, int j, char[][] grid, boolean[][] vis){
         int m = grid.length;
        int n = grid[0].length;

        vis[i][j]=true;
        if(i-1>=0 && grid[i-1][j]=='1' && vis[i-1][j]==false) dfs(i-1,j,grid,vis);

        if(i+1<m && grid[i+1][j]=='1' && vis[i+1][j]==false) dfs(i+1,j,grid,vis);

        if(j+1<n && grid[i][j+1]=='1' && vis[i][j+1]==false) dfs(i,j+1,grid,vis);
      
        if(j-1>=0 && grid[i][j-1]=='1' && vis[i][j-1]==false) dfs(i,j-1,grid,vis);


    }

    }
