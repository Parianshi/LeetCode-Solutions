class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stk= new Stack<>();
        HashMap<Integer,Integer> mp= new HashMap<>();

        int []res=new int [nums1.length];

        for(int num: nums2){
            while(!stk.isEmpty() && num>stk.peek()){
                mp.put(stk.pop(),num);
            }
            stk.push(num);
        }
        
        while(!stk.isEmpty()){
            mp.put(stk.pop(),-1);
        }
        int idx=0;

        for(int num: nums1){
            res[idx++]=mp.get(num);
        }
        return res;
    }
}