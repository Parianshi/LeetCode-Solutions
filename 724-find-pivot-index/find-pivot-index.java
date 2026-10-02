class Solution {
    public int pivotIndex(int[] nums) {
        int total=0;
        for(int i=0;i<nums.length;i++){
            total += nums[i];
        }
        int ls=0, rs=0;
        for(int i=0;i<nums.length;i++){
            rs= total - nums[i] - ls;
            if(ls==rs) return i;
            ls += nums[i];
         }
         return -1;
    }
}