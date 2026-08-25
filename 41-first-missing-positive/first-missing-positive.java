class Solution {
    public int firstMissingPositive(int[] nums) {
        // Arrays.sort(nums);
        // int ans=1;
        // int n=nums.length;
        // for(int i=0;i<n;i++){
        //     if(nums[i]==ans) ans++;
        // }
        // return ans;

        HashSet<Integer> set= new HashSet<>();
        for(int num: nums){
            set.add(num);
        }

        int curr=1;
        while(set.contains(curr)){
            curr+=1;
        }
        return curr;
        
    }
}