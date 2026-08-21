class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stk= new Stack<>();
        int n=nums.length;
        int []res=new int[nums.length];
       Arrays.fill(res,-1);

       for(int i=0;i<2*n;i++){
        int idx=i%n;
        while(!stk.isEmpty() && nums[stk.peek()]<nums[idx]){
            int prev= stk.pop();
            res[prev]=nums[idx];
        }
        if(i<n){
            stk.push(idx);
        }
       }

        return res;
    }
}