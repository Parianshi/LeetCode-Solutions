class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer,Integer> mp= new HashMap<>();
        int len=0;
        int l=0;
        int r=0;
        int maxLen=0;
        for(r=0;r<nums.length;r++){
            int a=nums[r];
            mp.put(a, mp.getOrDefault(a,0)+1);
            if(mp.get(a)>k){
                while(l<r && mp.get(a)>k){
                    mp.put(nums[l  ], mp.get(nums[l])-1);
                    l++;
                }
            } else if(mp.get(a)<=k){
                maxLen=Math.max(maxLen, r-l+1);
            }
        }
        return maxLen;
        
    }
}