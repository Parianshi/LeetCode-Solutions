class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int r=height.length-1;
        int lh;
        int rh;
        int maxWater=0;

        while(l<r){
            lh= height[l];
            rh=height[r];
            if(lh<rh){
                int water= lh*(r-l);
                maxWater= Math.max(maxWater,water);
                l++;
            } else {
                int water= rh*(r-l);
                maxWater= Math.max(maxWater, water);
                r--;
            }
        }
        return maxWater;
    }
}