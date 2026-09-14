class Solution {
    public String removeStars(String s) {
        Stack<Character> stk= new Stack<>();
        String ans="";
        for(char ch: s.toCharArray()){
            if(ch=='*'){
                stk.pop();
            } else{
            stk.push(ch);
            }
        }

        for(char ch: stk){
            ans+=ch;
        }
        return ans;
    }
}