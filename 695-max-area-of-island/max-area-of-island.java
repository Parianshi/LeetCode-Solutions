class Solution {
    int [][]dirs= { {-1,0}, {1,0}, {0,-1}, {0,1}};
    public int dfs(int [][]grid,int i,int j){
        if(i<0 || i>=grid.length ||
           j<0 || j>=grid[0].length ||
           grid[i][j]==0) return 0;
           grid[i][j]=0;
           int area=1;
           for(int []dir: dirs){
            int nr= i+dir[0];
            int nc= j+dir[1];
            area += dfs(grid,nr,nc);
           }
           return area;
    }
    public int maxAreaOfIsland(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int maxCount=0;
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    int c=dfs(grid,i,j);
                    maxCount=Math.max(maxCount,c);
                }
            }
        }
        return maxCount;
    }
}