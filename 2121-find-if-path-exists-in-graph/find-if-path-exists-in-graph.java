class Solution {
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

        Queue<Integer> q= new LinkedList<>();
        q.add(source);

        while(!q.isEmpty()){
            int val= q.poll();
            if(val==destination) return true;
            for(int neighbour: adjList.get(val)){
                if(!vis[neighbour]){
                    q.add(neighbour);
                    vis[neighbour]=true;
                }
            }
        }

        return false;
        
    }
}