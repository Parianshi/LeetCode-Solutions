class Solution {
    public int longestSubarray(int[] nums) {
        int n= nums.length;
        int zeroes=0;
        int l=0,r=0;
        int maxLen=0;
        for(r=0;r<n;r++){
            if(nums[r]==0) zeroes++;
            while(zeroes>1){
                if(nums[l]==0) zeroes--;
                l++;
            }
            if(zeroes==1){
                maxLen=Math.max(maxLen,r-l);
            }
        }
        if(zeroes==0) {
                return nums.length-1;
            }
        return maxLen;
    }
}