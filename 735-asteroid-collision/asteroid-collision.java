class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stk= new Stack<>();
        for(int i=0;i<asteroids.length;i++){
            int curr=asteroids[i];
            boolean safe=true;
            while(curr<0 && !stk.isEmpty() && stk.peek()>0){
                if(-curr>stk.peek()){
                    stk.pop();
                    continue;
                } 
                if(-curr==stk.peek()){
                    stk.pop();
                }
                safe=false;
                break;
            }
            if(safe){
                stk.push(curr);
            }
        }

        int []ans=new int[stk.size()];
        for(int i=stk.size()-1;i>=0;i--){
            ans[i]= stk.pop();
        }
        return ans;
    }
}