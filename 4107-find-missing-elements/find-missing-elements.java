class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer> ans= new ArrayList<>();
        int n=nums.length;
        int min=nums[0];
        for(int num: nums){
            while(num!=min) {
                ans.add(min);
                min++;
            }
            min++;
        }
        
        return ans;
        
    }
}