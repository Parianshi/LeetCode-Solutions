class Solution {

    public boolean dfs(List<List<Integer>> adjList, int source, int destination, boolean [] vis){
        if(source==destination) return true;
        vis[source]=true;

        for(int neighbour : adjList.get(source)){
            if(!vis[neighbour]){
                if(dfs(adjList, neighbour, destination, vis)) return true;
            }
        }
        return false;
    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> adjList= new ArrayList<>();

        for(int i=0;i<n;i++){
            adjList.add(new ArrayList<>());
        }

        for(int []edge: edges){
            int u=edge[0], v=edge[1];

            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }

        boolean []vis= new boolean[n];

        return dfs(adjList, source, destination, vis);
        
    }
}