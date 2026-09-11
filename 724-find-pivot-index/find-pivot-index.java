class Solution {
    public int pivotIndex(int[] nums) {
        int n= nums.length;
        int totalSum=0;
        for(int i=0;i<n;i++){
            totalSum += nums[i];
        }
        int ls=0;

        for(int i=0;i<n;i++){
            int rs=totalSum-ls-nums[i];
            if(ls==rs) return i;
            ls+=nums[i];
        }

        return -1;
    }
}