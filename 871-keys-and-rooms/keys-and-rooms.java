class Solution {

    public void dfs(List<List<Integer>> rooms, int room, boolean []vis){
        vis[room]=true;
        for(int n: rooms.get(room)){
            if(!vis[n]){
                dfs(rooms,n,vis);
            }
        }
    }
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean []vis= new boolean [rooms.size()];
        dfs(rooms,0,vis);

        for(boolean v: vis){
            if(!v) return false;
        }
        return true;
    }
}