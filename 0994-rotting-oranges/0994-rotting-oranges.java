import java.util.*;

class Solution {

    static class pair {
        int row;
        int col;

        pair(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }

    public int orangesRotting(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;

        boolean[][] vis = new boolean[m][n];

        Queue<pair> q = new LinkedList<>();

        int fresh = 0;

        // Saare rotten oranges queue mein daalo
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (grid[i][j] == 2) {
                    q.add(new pair(i, j));
                    vis[i][j] = true;
                }

                if (grid[i][j] == 1) {
                    fresh++;
                }
            }
        }

        int count = 0;

        while (!q.isEmpty() && fresh > 0) {

            int size = q.size();

            for (int i = 0; i < size; i++) {

                pair front = q.remove();

                int row = front.row;
                int col = front.col;

                // UP
                if (row > 0) {

                    if (grid[row - 1][col] == 1
                            && vis[row - 1][col] == false) {

                        grid[row - 1][col] = 2;

                        q.add(new pair(row - 1, col));

                        vis[row - 1][col] = true;

                        fresh--;
                    }
                }

                // RIGHT
                if (col + 1 < n) {

                    if (grid[row][col + 1] == 1
                            && vis[row][col + 1] == false) {

                        grid[row][col + 1] = 2;

                        q.add(new pair(row, col + 1));

                        vis[row][col + 1] = true;

                        fresh--;
                    }
                }

                // DOWN
                if (row + 1 < m) {

                    if (grid[row + 1][col] == 1
                            && vis[row + 1][col] == false) {

                        grid[row + 1][col] = 2;

                        q.add(new pair(row + 1, col));

                        vis[row + 1][col] = true;

                        fresh--;
                    }
                }

                // LEFT
                if (col > 0) {

                    if (grid[row][col - 1] == 1
                            && vis[row][col - 1] == false) {

                        grid[row][col - 1] = 2;

                        q.add(new pair(row, col - 1));

                        vis[row][col - 1] = true;

                        fresh--;
                    }
                }
            }

            count++;
        }

        if (fresh > 0) {
            return -1;
        }

        return count;
    }
}