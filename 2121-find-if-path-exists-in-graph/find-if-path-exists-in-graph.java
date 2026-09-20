class Solution {
    public boolean dfs(List<List<Integer>> graph, int src, int dest, boolean []vis){
        if(src==dest) return true;
        vis[src]=true;
        for(int neighbour: graph.get(src)){
            if(!vis[neighbour]){
                if(dfs(graph,neighbour,dest,vis))
                     return true;
            }
        }
        return false;
    }

    public boolean validPath(int n, int[][] edges, int src, int dest) {
        boolean vis[]=new boolean[n];
        List<List<Integer>> graph= new ArrayList<>();
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }
        for(int []edge: edges){
            int x=edge[0];
            int y=edge[1];
            graph.get(x).add(y);
            graph.get(y).add(x);
        }
        return dfs(graph,src,dest,vis);
    }
}