class MinStack {
    Stack<Integer> mainStack;
    Stack<Integer> minStack;
        public MinStack() {
            mainStack=new Stack<Integer>();
            minStack=new Stack<Integer>();
        
    }
    
    public void push(int val) {
        //always push in the mainStack
        mainStack.push(val);
        //if minStack is Empty or val (curentVal<minStack.peek()value)
        //so push in minStack
        if(minStack.isEmpty()||val<=minStack.peek()){
            minStack.push(val);
        }
        else{
            minStack.push(minStack.peek());
        }
    }

    
    public void pop() {
        mainStack.pop();
        minStack.pop();
        
    }
    
    public int top() {
        return mainStack.peek();
    }
    
    public int getMin() {
        //O(1)nikaalna h issko bhi push pop peek ho jaate h O(1) TC pai
        return minStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */