class Solution {
    public boolean isBipartite(int[][] graph) {
        int V = graph.length;

        int[] color = new int[V];
        Arrays.fill(color,-1);
        for(int i=0; i<V; i++){
            if(color[i]==-1){
            if(!check(i,graph,color)){
                return false;
            }
            }
        }
        return true;
    }
    public boolean check(int start,int[][] graph,int[] color){
        
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        color[start]=0;

        while(!q.isEmpty()){
            int node = q.peek();
            q.remove();
            for(int neighbor : graph[node]){
                if(color[neighbor]==-1){
                    color[neighbor] = 1-color[node];
                    q.add(neighbor);
                }
              else if (color[neighbor] == color[node]) {

                    return false;
                }
            }
        }
        return true;
    }
}