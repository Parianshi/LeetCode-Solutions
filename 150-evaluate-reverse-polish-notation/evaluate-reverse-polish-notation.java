class Solution {

    public int Operator(int a,int b,String s){

        if(s.equals("+")) return a+b;
        if(s.equals("-")) return a-b;
        if(s.equals("*")) return a*b;
        if(s.equals("/")) return a/b;

        return -1;
    }
    public int evalRPN(String[] tokens) {
        Stack<Integer> stk= new Stack<>();

        for(String s: tokens){
            if(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")){
                int b=stk.peek();
                stk.pop();

                int a= stk.peek();
                stk.pop();

                int ans= Operator(a,b,s);
                stk.push(ans);
            }else{
                int ans = Integer.parseInt(s);
                stk.push(ans);
            }
        }

        return stk.peek();
        
    }
}