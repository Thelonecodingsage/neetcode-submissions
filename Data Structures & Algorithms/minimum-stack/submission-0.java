class MinStack {
    Deque<Integer> stack;
    Deque<Integer> minStack;

    public MinStack() {
        stack = new ArrayDeque<>();
        minStack = new ArrayDeque<>();
    }
    
    public void push(int val) {
        stack.push(val);
        if (minStack.isEmpty()){
            minStack.push(val);
        } else {
            minStack.push(Math.min(val, minStack.peek()));
        }
    }
    
    public void pop() {
        if (!stack.isEmpty()){
            stack.pop();
            minStack.pop();
        }
    }
    
    public int top() {
        if (!stack.isEmpty()){
            return stack.peek();
        } else {
            return -1;
        }
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
