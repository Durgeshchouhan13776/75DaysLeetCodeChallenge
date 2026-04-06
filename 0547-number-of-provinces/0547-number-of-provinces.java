import java.util.*;

class Solution {

    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
            for (int j = 0; j < n; j++) {
                adj.get(i).add(isConnected[i][j]);
            }
        }
        return numProvinces(adj, n);
    }
    
    public static int numProvinces(ArrayList<ArrayList<Integer>> adj, int n) {
        int count = 0;
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                bfs(i, visited, adj);
                count++;
            }
        }
        return count;
    }

    public static void bfs(int i, boolean[] visited, ArrayList<ArrayList<Integer>> adj) {
        int n = adj.size();
        Queue<Integer> q = new LinkedList<>();

        q.add(i);
        visited[i] = true;

        while (!q.isEmpty()) {
            int front = q.remove();

            for (int j = 0; j < n; j++) {
                if (adj.get(front).get(j) == 1 && !visited[j]) {
                    q.add(j);
                    visited[j] = true;
                }
            }
        }
    }
}