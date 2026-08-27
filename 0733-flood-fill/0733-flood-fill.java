class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int oldcolor = image[sr][sc];

        if (oldcolor == color) {
            return image;
        }

        dfs(image, sr, sc, color, oldcolor);

        return image;
    }

    public void dfs(int[][] image, int sr, int sc, int color, int oldcolor) {
        int m = image.length;
        int n = image[0].length;

        if (image[sr][sc] != oldcolor) {
            return;
        }

        image[sr][sc] = color;

        if (sr - 1 >= 0)
            dfs(image, sr - 1, sc, color, oldcolor);

        if (sr + 1 < m)
            dfs(image, sr + 1, sc, color, oldcolor);

        if (sc - 1 >= 0)
            dfs(image, sr, sc - 1, color, oldcolor);

        if (sc + 1 < n)
            dfs(image, sr, sc + 1, color, oldcolor);
    }
}