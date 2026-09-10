class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum=0.0;
        int n=nums.length;
        
        for(int i=0;i<k;i++){
            sum += nums[i];
        }
        double maxSum= sum;

        for(int i=k;i<n;i++){
            sum = sum + nums[i] - nums[i-k];
            maxSum= Math.max(sum,maxSum);
        }

        return maxSum/k;
    }
}