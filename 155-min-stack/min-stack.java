class MinStack {

    Stack<Integer> stk;
    Stack<Integer> minStk;

    public MinStack() {
        stk= new Stack<>();
        minStk= new Stack<>();
    }
    
    public void push(int value) {
        stk.push(value);
        if(minStk.isEmpty() || minStk.peek()>=value){
            minStk.push(value);
        } 
    }
    
    public void pop() {

        int a=stk.pop();
        if(a==minStk.peek()){
            minStk.pop();
        }   
    }
    
    public int top() {
        return stk.peek();
        
    }
    
    public int getMin() {
     return minStk.peek();   
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */