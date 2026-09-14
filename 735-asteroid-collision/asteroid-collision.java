class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int n=asteroids.length;
        
        int idx=0;
        Stack<Integer> stk= new Stack<>();

        for(int i=0;i<n;i++){
            boolean alive=true;
            int curr= asteroids[i];
            while(!stk.isEmpty() && curr<0 && stk.peek()>0){
                if(-curr>stk.peek()){
                    stk.pop();
                    continue;
                } else if(stk.peek()== -curr){
                    stk.pop();
                }
                alive=false;
                break;
            }
            if(alive){
                stk.push(curr);
            }
        }
        int []ans= new int[stk.size()];

        for(int i=stk.size()-1;i>=0;i--){
            ans[i]= stk.pop();
        }
        return ans;
    }
}