class Solution {

    public void dfs(int [][]image, int i,int j,int org,int color){
        int m=image.length;
        int n=image[0].length;
        if(i<0 || i>=m || j<0 || j>=n || org==color || image[i][j]!=org) return;
        image[i][j]=color;
        dfs(image,i+1,j,org,color);
        dfs(image,i,j+1,org,color);
        dfs(image,i-1,j,org,color);
        dfs(image,i,j-1,org,color);
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int org=image[sr][sc];
        dfs(image,sr,sc,org,color);
        return image;
    }
}