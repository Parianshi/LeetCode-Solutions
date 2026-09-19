class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stk=new Stack<>();
        int []ans= new int [temperatures.length];
        int idx=0;
        for(int i=0;i<temperatures.length;i++){
            while(!stk.isEmpty() && temperatures[stk.peek()]<temperatures[i]){
                ans[stk.peek()]=i-stk.peek();
                stk.pop();
            }
            stk.push(i);
        }
        return ans;

    }
}