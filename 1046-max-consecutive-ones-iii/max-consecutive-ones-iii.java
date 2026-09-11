class Solution {
    public int longestOnes(int[] nums, int k) {
        int zeroes=0;
        int l=0,r=0;
        int maxLen=0;
        for( r=0;r<nums.length;r++){
            if(nums[r]==0) zeroes++;
            while(zeroes>k){
                if(nums[l]==0) zeroes--;
                l++;
            }

            if(zeroes<=k){
                maxLen= Math.max(maxLen, r-l+1);
            }
        }
        return maxLen;
    }
}