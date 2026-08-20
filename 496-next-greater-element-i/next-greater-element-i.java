class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stk= new Stack<>();
        HashMap<Integer,Integer> mp = new HashMap<>();
        int n=nums1.length;
        int []res = new int[n];

        for(int num: nums2){
            while(!stk.isEmpty() && num>stk.peek()){
                mp.put(stk.pop(),num);
            }
            stk.push(num);
        }

        while(!stk.isEmpty()){
            mp.put(stk.pop(),-1);
        }

        for(int i=0;i<nums1.length;i++){
            res[i]= mp.get(nums1[i]);
        }

        return res;
    }
}