class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk= new Stack<>();

        for(char c: s.toCharArray()){
            if(c=='{') stk.push('}');
            else if(c=='(') stk.push(')');
            else if(c=='[') stk.push(']');
            else if(stk.isEmpty() || stk.peek()!=c) return false;
            else stk.pop();
        }

        if(stk.isEmpty()) return true;
        else return false;
    }
}