class Solution {
    public int largestAltitude(int[] gain) {
        int ans=0;
        int maxAns=0;
        for(int i=0;i<gain.length;i++){
            ans += gain[i];
            maxAns= Math.max(maxAns,ans);
        }
        return maxAns;
        
    }
}