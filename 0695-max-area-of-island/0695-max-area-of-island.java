class Solution {

    public int maxAreaOfIsland(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;
        int maxlen = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (grid[i][j] == 1) {

                    int count = dfs(i, j, grid);

                    maxlen = Math.max(maxlen, count);
                }
            }
        }

        return maxlen;
    }

    public int dfs(int i, int j, int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;

        if (i < 0 || i >= m || j < 0 || j >= n || grid[i][j] == 0) {
            return 0;
        }

        grid[i][j] = 0;

        int count = 1;

        count += dfs(i - 1, j, grid);
        count += dfs(i + 1, j, grid);
        count += dfs(i, j - 1, grid);
        count += dfs(i, j + 1, grid);

        return count;
    }
}